# Kotlin语法篇：类与对象

作者: 郭孝星
邮箱: guoxiaoxingse@163.com
博客: http://blog.csdn.net/allenwells
简书: http://www.jianshu.com/users/66a47e04215b/latest_articles

**关于作者**

>郭孝星，非著名程序员，主要从事Android平台基础架构与中间件方面的工作。技术栈主要涉及Android/Linux, Java/Kotlin/JVM，Python, JavaScript/React/ReactNative，数据结构与算法等方面。热爱编程与吉他，喜欢有趣的事物和人。

**关于文章**

>作者的文章首发在[Github](https://github.com/guoxiaoxing)上，也会发在[简书](http://www.jianshu.com/users/66a47e04215b/latest_articles)与[CSDN](http://blog.csdn.net/allenwells)平台上，文章内容主要包含Android/Linux, Java/Kotlin/JVM，Python, JavaScript/React/ReactNative, 数据结构与算法等方面的内容。如果有什么问题，也欢迎发邮件与我交流。

Kotlin与Java一样也是面向对象的语言，也有Java里的继承、多态这些特性。

## 类

### 构造器

>类的构造方法用constructor关键字标识。

Java

```java
public class Person {

    private String name;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void say(String message){
        System.out.print(message);
    }
}

```
Kotlin

```java
class Person {

    private var name: String? = null
    private val age: Int

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun say(message: String) {
        print(message)
    }
}

```

如果只有一个构造方法可以简写成：

```java
class Person(private val name: String)
```

注：类实例化直接用var person = Person()，没有new关键字。

我们可以直接定义类的属性。

```java
class Address {
    var name: String = ...
    var street: String = ...
    var city: String = ...
    var state: String? = ...
    var zip: String = ...
}
```
然后直接用属性名使用这个属性。

```java
fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin
    result.name = address.name // accessors are called
    result.street = address.street
    // ...
    return result
}
```

### 属性与字段

### 继承

Kotlin中继承用“:”表示，相当于Java中的extends

Java

```java
public class Student extends Person{
    
    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void say(String message) {
        super.say(message);
    }
}
```

Kotlin

```java
class Student : Person {

    constructor(name: String) : super(name) {}

    constructor(name: String, age: Int) : super(name, age) {}

    override fun say(message: String) {
        super.say(message)
    }
}
```
### 抽象类

Kotlin用关键字abstract定义抽象类

Java

```java
public abstract class Person {

    private String name;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(String message){
        System.out.print(message);
    }
}

```

Kotlin

```java
abstract class Person {

    private var name: String? = null
    private var age: Int = 0

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    open fun say(message: String) {
        print(message)
    }
}
```
### 内部类

>Kotlin的内部类用inner关键字标识。

内部类

```java
class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo = Outer().Inner().foo() // == 1
```
匿名内部类

```java
window.addMouseListener(object: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {
        // ...
    }
                                                                                                            
    override fun mouseEntered(e: MouseEvent) {
        // ...
    }
})
```
### 枚举类\
>Kotlin中的枚举类用enum来标识。

枚举类
```java
enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
}
```

匿名枚举类
```java
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}
```

枚举类提供了valueOf方法来调用枚举常量。
```java
EnumClass.valueOf(value: String): EnumClass
EnumClass.values(): Array<EnumClass>
``
每个枚举常量都用name与ordinal属性。

```java
val name: String //name
val ordinal: Int //position
```

**举例**
```java
enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

printAllValues<RGB>() // prints RED, GREEN, BLUE
```

## 对象

>如果我们想创建一个对象而又不想单独为它创建一个类，在Java中我们会用匿名内部类来解决这个问题，而在
>Kotlin中，我们则用object表达式来解决这个问题。

我们可以去实现接口从而创建对象

```java
//MouseAdapter是个借口
window.addMouseListener(object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) {
        // ...
    }

    override fun mouseEntered(e: MouseEvent) {
        // ...
    }
})
```
我们也可以直接去创建一个对象

```java
fun foo() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}
```
另外，匿名对象只有在局部函数中使用或者定义为private

```java
class C {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "x"
    }

    // Public function, so the return type is Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // Works
        val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
    }
}
```

