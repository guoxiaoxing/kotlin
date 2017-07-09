# Kotlin实践篇：操作符.md

**关于作者**

>郭孝星，非著名程序员，主要从事Android平台基础架构与中间件方面的工作，爱好广泛，技术栈主要涉及以下几个方面
>
>- Android/Linux
>- Java/Kotlin/JVM
>- Python
>- JavaScript/React/ReactNative
>- DataStructure/Algorithm
>
>文章首发于[Github](https://github.com/guoxiaoxing)，后续也会同步在[简书](http://www.jianshu.com/users/66a47e04215b/latest_articles)与
[CSDN](http://blog.csdn.net/allenwells)等博客平台上。文章中如果有什么问题，欢迎发邮件与我交流，邮件可发至guoxiaoxingse@163.com。

与Java相似，Kotlin中的类也继承于共同的超类Any

```kotlin
public open class Any {
    /**
     * Indicates whether some other object is "equal to" this one. Implementations must fulfil the following
     * requirements:
     *
     * * Reflexive: for any non-null reference value x, x.equals(x) should return true.
     * * Symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
     * * Transitive:  for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true
     * * Consistent:  for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
     *
     * Note that the `==` operator in Kotlin code is translated into a call to [equals] when objects on both sides of the
     * operator are not null.
     */
    public open operator fun equals(other: Any?): Boolean

    /**
     * Returns a hash code value for the object.  The general contract of hashCode is:
     *
     * * Whenever it is invoked on the same object more than once, the hashCode method must consistently return the same integer, provided no information used in equals comparisons on the object is modified.
     * * If two objects are equal according to the equals() method, then calling the hashCode method on each of the two objects must produce the same integer result.
     */
    public open fun hashCode(): Int

    /**
     * Returns a string representation of the object.
     */
    public open fun toString(): String
}

```

## 类的结构

### 构造器

在Kotlin的类中可以用一个主构造函数与多个次构造哈数

主构造函数

主构造函数是类头的一部分，它跟在类名后

没有有注解或者可见性修饰符时候，constructor关键字可以省略。
```kotlin

class Person @Inject constructor(name: String){

}
```
```kotlin
class Person public constructor(name: String){

}
```

```kotlin
class Person (name: String){

}
```
次构造函数

次构造函数也可以用constructor来声明



```kotlin
class Person{
 constructor(name: String){
 
 }
}
```
### 属性

#### getter与setter

val：不可变属性

var：可变属性

```kotlin
var a: Int? //错误，属性要么是抽象的，要么就需要显式的初始化
var b = 1 //默认Int，包含getter与setter
val b = 1 //默认Int，包含getter
```
定义一个属性的完整语法包含initializer、getter与setter，例如：

```kotlin
var str: String
get() = this.toString()
set(value) {
    // process value and return
}
```

#### const

const将变量标记为编译期常量，它满足以下条件：

- 位于顶层或者object的一个成员
- 用String或者原生类型值初始化
- 没有自定义getter

```kotlin
const val CONSTNAT: String = "I am a constant"
```

#### lateinit

我们上面说来声明为非空类型的必须显示的初始化，当你觉得这样不方便的时候，你可以将它标记为lateinit，这样你可以在你需要的地方
再将它初始化。

```kotlin
class Property {

    var a: String
        get() = a
        set(value) {
            a = value
        }

    val b: Int = 1
    
    lateinit var name: String

    constructor(name: String){
        this.name = name
    }
}
```

## 类的特性

### 继承

Kotlin力求清晰显示，如果要实现继承，则需要将这个类标记为open，对于需要覆盖的方法与属性也需要标记为open，且子类需要添加override注解。

继承类

```kotlin
open class Person constructor(name: String) {

    open val age = 20

    open fun talk(){
        
    }
}
```

```kotlin
class Teacher(name: String) : Person(name) {

    override val age: Int
        get() = super.age

    override fun talk() {
        super.talk()
    }
}

```

## 类的分类

### 数据类

在Java中我们会用到协议只保存数据的类，我们呀为它们写大量重复的方法，在Kotlin只需要用用data关键字标记。

```kotlin
data class Model(val name: String, val age: Int)
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