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

构造方法用constructor关键字表示

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


