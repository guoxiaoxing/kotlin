# Kotlin项目实践指南(上)

**关于作者**

>郭孝星，程序员，吉他手，主要从事Android平台基础架构方面的工作，欢迎交流技术方面的问题，可以去我的[Github](https://github.com/guoxiaoxing)提issue或者发邮件至guoxiaoxingse@163.com与我交流。

**文章目录**

- 一 表达式与语句
- 二 函数和变量
- 三 类、对象和接口
- 四 集合
- 五 注解与泛型
- 六 类型系统
- 七 Lambda与高阶函数
- 八 DSL构建
- 项目实践

注：文章中"举例"字样代表所举的例子，"区别"字样代码Kotlin与Java不同的地方，

更多文章请参见[文章目录](https://github.com/guoxiaoxing/kotlin)。

- [文章源码](https://github.com/guoxiaoxing/kotlin/tree/master/demo)

本篇文章是本系列文章的开篇文章，主要介绍Java中的编程概念（语句、函数、类等）是如何映射到Kotlin的代码中的。本文的目的在于帮助大家快速理解Java里的语法在Kotlin中如何实现，以及
它们之间有什么区别。

>Kotlin是一种在Java虚拟机上运行的静态类型编程语言。

- Kotlin是静态语言并且支持类型推导，允许维护正确性与性能的同时保证了源代码的简洁性。
- Kotlin支持函数式和面向对象两种编程风格，通过头等函数使得更高级别的抽象成为了可能，通过支持不可变值简化了测试和多线程并发。
- Kotlin与Java具有良好的互操作性，Kotlin可以去使用Java的API、继承Java的类型、实现Java的接口，同样的，Java也可以像调用其他Java代码那样调用Kotlin，这为语言混用打下了坚实的基础。

写在前面的总结，从Java过度到Kotlin，有哪些被替换的地方。🤔

- 用Kotlin的顶层函数和顶层属性代替Java里一堆堆的Utils工具类的写法
- 用Kotlin的data数据类代替Java里的Bean类里的大量模板代码
- 用object对象代替Java里的匿名内部类
- 用companion object代替Java里的静态方法和静态变量的调用，这种用来需要访问类的private成员的情况，其他情况还是可以用顶层函数和顶层属性。
- 类和方法默认都是final的
- Java里的Builder写法很好的避免了臃肿的构造函数列表，而在Kotlin首先构造函数参数可以有默认值，另外apply扩展原生支持Builder模式。

Android Stduio 3.0已经正式支持Kotlin，如果你是第一次接触Kotlin，你可以看一下下面3篇文章，跑一下Demo，体会一下Kotlin。

- [Gradle Config for Kotlin in Android](https://kotlinlang.org/docs/reference/using-gradle.html)
- [Get Started with Kotlin on Android]( https://developer.android.com/kotlin/get-started.html)
- [Using Kotlin for Android Development](https://kotlinlang.org/docs/reference/android-overview.html)

## 一 表达式与运算符

### 1.1 控制表达式

Kotlin常见的控制语句有：

- 条件表达式if、when
- 异常处理try/catch、throw
- 循环表达式for/in、while与do/while

Kotlin的控制语句和Java有所区别🤔，它们具备更强大的功能，在介绍控制语句之前，我们要先理解两条规则：

在Kotlin中，if是表达式，而在Java中if是语句。

- 表达式：表达式有值，并且可以作为另一个表达式的一部分使用。
- 语句：语句是包围着它的代码块的底层元素，而且它没有值。

关于Kotlin的表达式，有两条规则需要我们理解：

- 出来循环语句外，其他表达式是有有返回值的
- 在if、when、try等代码块中，最后的表达式就是要返回的结果

在Java中所有的控制语句都是表达式，而在Kotlin中，除了循环（for、do与do/while）是语句外，其他大部分控制结构都是表达式，都有值。
而恰恰在Java中是表达式的赋值操作（a = 1）在Kotlin中却是语句，这样有助于避免比较操作（==）和赋值（=）操作之间的混淆。

有了上面两条规则，我们不难理解以下例子。

**举例**

```kotlin
val a = 1
val b = 2

val ifResult = if (a > b) a else b

val whenResult = when (a > b) {
    true -> a
    else -> b
}

val number = try {
    Integer.parseInt("1")
} catch (e: NumberFormatException) {
    null
}

for (i: Int in 1..100){
    Logger.d(i)
}

for((key, value) in map){
````//使用key，value
}

//变量 a 和 b 的值取自对集合中的元素上调用 component1() 和 component2() 的返回值。
for ((a, b) in collection) { …… }
```

## 1.2 操作符

- ==：调用的是对象的equals()方法进行想等性比较。
- ===：进行对象引用的比较，这和Java的==相似。
- is：类似于Java的Instanceof，用于类型检查，而且当检查类型成功后，会自动将变量转换为这个类型。

Kotlin提供了非常多类似于RxJava的操作符，为日常的开发提供了极大的方便。更多操作符可以参考[操作符列表](https://wangjiegulu.gitbooks.io/kotlin-for-android-developers-zh/zong_shu_cao_zuo_fu.html)

### 1.3 中缀调用

>函数还可以用中缀表示法调用，当它们是成员函数或扩展函数；它们只有一个参数；它们用 infix 关键字标注。

```kotlin
/**
 * 用infix定义一个中缀函数
 */
infix fun Int.shl(x: Int) {
    println("I am a infix method")
}

/**
 * 中缀调用
 */
fun useInfixMethod() {
    1 shl 2
}
```

### 1.4 解构声明

>解构声明是将一个对象解构成多个变量，一个解构声明会同时创建多个变量。

要实现解构声明，我们需要添加componentN函数，componentN函数指定要返回的域，并使用operator标记

```kotlin
class Teacher(val name: String, val age: Int) : Person(name, age), IBehavior {

    override fun talk() {
        super<Person>.talk()
        super<IBehavior>.talk()
    }

    operator fun component1(): Any {
        return name
    }

    operator fun component2(): Any {
        return age
    }
}

```
然后我们就可以使用解构声明批量的创建变量，解构赋值是按照omponentN函数的顺序来执行的。

```kotlin
val teacher = Teacher("LiLei", 20)
val (name, age) = teacher

Logger.d("name: " + name)
Logger.d("age: " + age)
```

如果我们在解构声明中不需要某个变量，用下划线代替即可。

```kotlin
val (_, age) = teacher
```

## 二 函数和变量

>函数的声明以fun关键字开始，函数名称紧跟其后，然后是形参列表，形参列表后面是返回值，如果没有指定返回值，默认的返回值是Unit。

**举例**

```kotlin
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
```

如果函数中只有一个表达式，可以将这个表达式作为完整的函数体，称为表达式函数体，例如：

```kotlin
fun max(a: Int, b: Int): Int = if (a > b) a else b
```

Kotlin变量的声明从关键字var与val开始，Kotlin会自动进行类型推导，因此你无需显式的声明类型。

- val：不可变引用，变量在初始化之后不能再被修改，也就是val引用自身不能再被修改，但是它指向的对象是可变的。
- var：可变引用，变量在初始化之后可以再被修改，var引用自身可以被修改，但是它的类型不可以改变。

**举例**

```kotlin
val name =  "Nick"
var age = 10
```

默认情况下，应该尽可能的使用val关键字来声明变量，仅在必要的时候使用var，使用不可变引用，不可以对象以及无副作用的函数可以让你的代码更加接近函数式编程风格。

注：这里提一下Kotlin的package结构，和Java一样Kotlin也有包的概念，但是Kotlin对源码的文件组织更为自由，多个类可以在同一个文件中，文件的名字和目录也可以随意选择，但是我们还是
会按照Java的目录布局去组织源码，这是一种良好的实践，但在Kotlin中很多类都非常小，例如数据类，这种情况下，我们通常把它放在一个文件里。

### 2.1 默认参数值

在Java中定义函数时，有些参数有默认值，这就导致会定义大量的重载函数（参考Thread的构造函数），而在Kotlin中可以利用参数的默认值来避免这个问题。

```kotlin
/**
 * 函数可以带默认参数，@JvmOverloads注解可以在编译时生成重载函数
 */
@JvmOverloads
fun maxWithDefault(a: Int = 1, b: Int = 2): Int {
    return if (a > b) a else b
}
```

注：但是Java中没有参数默认值的概念，为了方便Java调用Kotlin，可以用@JvmOverloads去注解它，@JvmOverloads注解可以在编译时生成重载函数。

### 2.2 顶层函数和属性

回想一下，我们的项目中是不是有很多Utils类，它们一种静态的方式被我们调用。这些Utils类本身没有实际意义，只是作为函数的容器，而在Kotlin中我们无需
这么做，我们可以把这些函数和属性直接定义在代码文件的顶层，不用从属任何类，然后用一种导包的方式使用它。

定义

```kotlin
/**
 * 顶层函数，可以直接导包然后使用
 */
val topProperty = "I am a top property"

/**
 * 顶层函数，可以直接导包然后使用
 */
fun topMethod(property: String) {
    println("I am a top method")
}

class Method {

}
```

调用

```kotlin
import com.guoxiaoxing.kotlin.demo._02_method.topMethod
import com.guoxiaoxing.kotlin.demo._02_method.topProperty

object MethodClient {

    @JvmStatic
    fun main(args: Array<String>) {
        topMethod(topProperty)
    }
}
```

### 2.3 扩展函数和属性

Kotlin的一大优势就在于它可以平滑的与Java进行集成，例如我们想要用Kotlin为Java里的类添加一个方法，这时我们不要去修改Java的源码，而是可以使用扩展函数与属性。

- 扩展函数可以访问被扩展类的public属性与方法，不可以访问private、proteced的属性与方法。
- 扩展函数最终会被编译成静态函数，因此Java里可以用调用静态方法的方式来调用它。
- 扩展函数不可以被重写
- 扩展函数如果和被扩展类的成员函数重名，会优先使用被扩展类的成员函数。

```kotlin

/**
 * 为String类添加一个扩展属性extensionProperty，这个String类可以是Kotlin、Java甚至其他任何JVM语言编写的类
 */
val String.extensionProperty
    get() = "I am a extension property"

/**
 * 为String类添加一个扩展函数extensionMethod()，这个String类可以是Kotlin、Java甚至其他任何JVM语言编写的类
 */
fun String.extensionMethod() {
    println("I am a extension method")
}


/**
 * 使用扩展函数
 */
fun useExtensionMethod() {
    val a = "string"
    a.extensionProperty
    a.extensionMethod()
}
```
### 2.4 局部函数

好的代码设计就是尽量减少重复代码，很多时候我们会把重复的代码提取成一个函数进行调用，Kotlin更进一步，它允许你在函数的内部定义函数进行调用。

```kotlin
/**
 * 为了代码的简洁性，我们还可以定义局部函数
 */
fun outerMethod() {
    fun innerMethod() {

    }
}
```

## 三 类、对象和接口

>Kotlin中类使用class关键声明、接口使用Interface声明，使用冒号（:）代替了extends与implements关键字，可以实现多个接口，但是只能继承一个类。

Kotlin中也有和Java中相似的类与接口的概念，但是有所区别🤔

- Kotlin中的类默认是public、final的，这样就解决了Java中"脆弱的基类"的问题，如果我们想要这个类可以被继承，需要使用open关键字标记这个类。
- Kotlin中也有抽象类的概念，使用abstract关键字标记。
- 接口可以定义自己的成员变量，也可以为定义的方法提供默认的实现。


访问修饰符

- final：不能被重写
- open：可以被重写
- bstract：必须被重写
- override：重写父类或者接口中的方法或者变量

可见性

- public：默认，所有地方可见
- internal：模块内可见，一个模块指的是在一起编译的一组Kotlin文件（一个maven项目、一个gradle项目等），它实现了完整的模块星封装，而不像Java那样，只有把代码定义在相同的包名里就可以
得到访问你的包私有声明的权限。
- protected：子类中可见，Java中可以从同一个包中访问protected成员，Kotlin彻底规范了这个行为，只能在子类中可见。
- private：类中可见

```kotlin
open class BaseClass {

    open fun extendClass() {

    }
}

interface BaseInterface {

    val name: String

    fun implementInterface()
}

class Clasz(override val name: String) : BaseClass(), BaseInterface {

    override fun extendClass() {
        println("I override the BaseClass")
    }


    override fun implementInterface() {
        println("I implment the BaseInterface")
    }
}
```

构造方法

Kotlin里的构造方法分为主构造函数和从构造方法，主构造函数是类头的一部分，它跟在类名后，类初始化的代码可以放在init代码块里完成。Kotlin也支持参数默认值，所以我们无需像Java那样提供多个重载的构造方法来提供参数默认值。

- 如同Java一样，Kotlin也会提供一个没有任何参数的构造方法，这也是我们在继承类的时候会在类后面加一个空的括号，这表示调用父类的构造方法。
- 如果类有一个主构造函数，每个次构造函数需要委托给主构造函数， 可以直接委托或者通过别的次构造函数间接委托。委托到同一个类的另一个构造函数用 this 关键字即可。

```kotlin
class Clasz(override val name: String){

    /**************************************** 构造方法与初始化 *********************************************/

    init {
        //TODO 初始化类，在类创建时被调用
    }

    /**
     * 从构造函数
     *
     * 如果类有一个主构造函数，每个次构造函数需要委托给主构造函数， 可以直接委托或者通过别
     * 的次构造函数间接委托。委托到同一个类的另一个构造函数用 this 关键字即可
     */
    constructor(name: String, age: Int) : this(name) {
        println("I am a secondary constructor")
    }
}
```

## 3.1 嵌套类与内部类

>嵌套的类默认不是内部类，不持有外部类引用，也无法使用外部类成员变量，如果想定义成内部类，需要用关键字inner声明，内部类是持有外部类引用的，可以使用
外部类成员变量。

```kotlin
class Clasz {

    private var outerProperty = "I am a outer property"

    /**************************************** 嵌套类与内部类 ***********************************************/

    /**
     * 嵌套类，不持有外部类引用，也无法使用外部类成员变量
     */
    class nestClass() {

        fun nestMethod() {
        }
    }

    /**
     * 内部类，持有外部类引用，可以使用外部类成员变量
     */
    inner class innerClass() {

        fun nestMethod() {
            outerProperty = "I cam use outerProperty"
        }
    }
}
```

## 3.2 数据类

在Java中我们会用到协议只保存数据的类，我们呀为它们写大量重复的方法，在Kotlin只需要用用data关键字标记。

```kotlin
data class Model(val name: String)
```

就这么简单的一行代码，你将得到：

- equals()/hashCode() 
- toString() 格式是 "Model(name=John, age=42)
- componentN() 函数 按声明顺序对应于所有属性，
- copy() 函数

为了保证数据类的一致性，数据类必须满足：

- 主构造函数需要至少有一个参数；
- 主构造函数的所有参数需要标记为 val 或 var；
- 数据类不能是抽象、开放、密封或者内部的；
- （在1.1之前）数据类只能实现接口。

## 3.3 object对象

>Kotlin没有static的概念，但是提供了object关键字，它代表了在创建一个类的同时并提供一个对象。

object关键字通常用在：

- object表达式实现单例
- object表达式用来代替Java的匿名内部类，注意匿名对象不是单例的，每次执行代码，都会创建一个新的对象。
- object对象也可以继承自类和接口
- object对象会被编译成静态字段，如果使用Java调用，可以通过objectName.INSTANCE的方式进行调用。

```kotlin
object Single {

}
```

```kotlin
/**
 * 匿名内部类
 */
view.setOnClickListener(object : View.OnClickListener{
        override fun onClick(v: View?) {
        }
    })
```

另外还有一种companion object（伴生对象），伴生对象是一种声明在类中的普通对象，它也可以有自己的名字，实现一个接口或者有扩展函数和属性。

Kotlin的伴生对象会被编译成常见静态字段，可以通过ClassName.Companion来访问它，如果伴生对象有名字，则用这个名字替换掉Companion。

```kotlin
class Singleton {

    /**
     * 单例
     */
    companion object {
        val instance by lazy { Singleton() }
    }
}
```

## 四 项目实践

如果你还没有尝试过Kotlin，Android Stduio 3.0已经正式支持Kotlin，如果你是第一次接触Kotlin，你可以看一下下面3篇文章，跑一下Demo，体会一下Kotlin。

- [Gradle Config for Kotlin in Android](https://kotlinlang.org/docs/reference/using-gradle.html)
- [Get Started with Kotlin on Android]( https://developer.android.com/kotlin/get-started.html)
- [Using Kotlin for Android Development](https://kotlinlang.org/docs/reference/android-overview.html)

### 4.1 findViewById

利用kotlin-android-extensions，我们可以直接使用xml文件里的文件id，和findViewById说再见。

注：目前只能在Activity、Fragment、Adapter上使用。

依赖配置

```
apply plugin: 'kotlin-android-extensions'
```

导入属性

```kotlin
// 使用来自主代码集的 R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

// 如果是Adapter则在后面多加个View R.layout.adapter_layout
import kotlinx.android.synthetic.main.adapter_layout.view.*

class MyActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText("Hello, world!")
        // 而不是 findViewById(R.id.textView) as TextView
    }
}
```

更多细节：https://kotlinlang.org/docs/tutorials/android-plugin.html

### 4.2 Anko

Anke是一个Android开发的工具库，它可以通过Anko DSL代码书写代替XML来进行UI布局。这是一个非常有效的特性，当然它也有许多有用的functions，可以大大提升我们的开发效率。

例如：

- find()代替findViewById()
- longToast()代替原生Toast()
- startActivity(vararg params: Pair<String, Any>代替原生startActivity()
- Anko SQLite简化原生的SQLite的使用

更多细节：https://github.com/Kotlin/anko


以上就是本篇文章上半部分的全部内容，下半部分我们会来深入探讨泛型、注解、反射、Kotlin类型系统、Lambda与高阶函数以及DSL构建等方面的内容。


---------------------------------------------我是Kotlin项目的分割线😆-------------------------------------------------

项目地址：https://github.com/guoxiaoxing/phoenix

# <img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/logo.png" alt="Phoenix" width="40" height="40" /> Phoenix

## 功能介绍

[![Jitpack version](https://jitpack.io/v/guoxiaoxing/phoenix.svg)](https://jitpack.io/#guoxiaoxing/phoenix) 
[![License](https://jitpack.io/v/guoxiaoxing/phoenix.svg)](https://jitpack.io/#guoxiaoxing/phoenix) 

>Android平台上图片/视频选择，编辑和压缩的一站式解决方案。

图片/视频的选择，编辑和压缩是业务中的常见需求，Phoenix完整的实现了这些功能，并提供了优雅的调用方式。Phoenix的核心功能基于Kotlin实现，外层接口基于Java实现，方便Kotlin与Java双方的调用。

**特点**

- 功能相互独立，各个功能的实现依赖于约定的接口，彼此互不依赖，开发者不必为了引入某一个功能而带入一堆依赖。
- 高度的UI定制性，内置四种配色方案，开发者也可以通过简单的style文件的简单配置来定制自己的UI。
- 调用的便利性，开启某个功能只需要调用enableXXX(true)方法，结果统一在MediaEntity里获取。
- RxJava良好的支持性，每个功能都提供了同步与异步两种实现，便于开发者利用RxJava进行功能的组合与嵌套。
- 良好的版本兼容性，运行时权限等内容都做了兼容性处理。

<p align="center">
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/play_1.gif" height="400"/>
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/play_2.gif" height="400"/>
</p>

**功能**

- 拍照
- 图片选择
- 图片预览
- 图片压缩
- 图片标记、贴图、涂抹与裁剪
- 视频选择
- 视频预览
- 视频压缩

<p align="center">
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/function_1.png" height="400"/>
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/function_2.png" height="400"/>
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/function_3.png" height="400"/>
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/function_4.png" height="400"/>
</p>

**主题**

- 默认主题
- 橙色主图
- 红色主题
- 蓝色主题

<p align="center">
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/theme_default.png" height="400"/>
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/theme_red.png" height="400"/>
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/theme_orange.png" height="400"/>
<img src="https://github.com/guoxiaoxing/phoenix/raw/master/art/theme_blue.png" height="400"/>
</p>

## 快递开始

### 添加依赖

在项目根目录build.gradle文件里添加

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

添加依赖

```
//图片/视频选择、拍照、图片/视频预览
compile 'com.github.guoxiaoxing.phoenix:phoenix-ui:0.0.11'

//选填 - 图片压缩，开启功能：Phoenix.with().enableCompress(true)，获取结果：MediaEntity.getCompressPath()
compile 'com.github.guoxiaoxing.phoenix:phoenix-compress-picture:0.0.11'

//选填 - 视频压缩，开启功能：Phoenix.with().enableCompress(true)，获取结果：MediaEntity.getCompressPath()
compile 'com.github.guoxiaoxing.phoenix:phoenix-compress-video:0.0.11'
```

### 调用功能

```java
Phoenix.with()
        .theme(PhoenixOption.THEME_DEFAULT)// 主题
        .fileType(MimeType.ofAll())//显示的文件类型图片、视频、图片和视频
        .maxPickNumber(10)// 最大选择数量
        .minPickNumber(0)// 最小选择数量
        .spanCount(4)// 每行显示个数
        .pickMode(PhoenixConstant.MULTIPLE)// 多选/单选
        .enablePreview(true)// 是否开启预览
        .enableCamera(true)// 是否开启拍照
        .enableAnimation(true)// 选择界面图片点击效果
        .enableCompress(true)// 是否开启压缩
        .thumbnailHeight(160)// 选择界面图片高度
        .thumbnailWidth(160)// 选择界面图片宽度
        .enableClickSound(true)//ƒ 是否开启点击声音
        .pickedMediaList(pickList)// 已选图片数据
        .videoSecond(0)//显示多少秒以内的视频
        .onPickerListener(new OnPickerListener() {
            @Override
            public void onPickSuccess(List<MediaEntity> pickList) {
                adapter.setList(pickList);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onPickFailed(String errorMessage) {

            }
        }).start(MainActivity.this, PhoenixOption.TYPE_PICK_MEDIA);
```

最后的start()方法用来完成启动某项功能，根据type不同启动不同的功能，具体含义如下：

```
//功能 - 选择图片/视频/音频
public static final int TYPE_PICK_MEDIA = 0x000001;
//功能 - 拍照
public static final int TYPE_TAKE_PICTURE = 0x000002;
//功能 - 预览
public static final int TYPE_BROWSER_PICTURE = 0x000003;
```

## 更新日志

## 贡献代码

欢迎加入改进本项目

## License

```
Copyright 2017 Guoxiaoxing

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```