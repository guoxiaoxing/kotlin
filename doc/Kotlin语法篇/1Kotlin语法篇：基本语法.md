# Kotlin语法篇：基本语法

作者: 郭孝星
邮箱: guoxiaoxingse@163.com
博客: http://blog.csdn.net/allenwells
简书: http://www.jianshu.com/users/66a47e04215b/latest_articles

**关于作者**

>郭孝星，非著名程序员，主要从事Android平台基础架构与中间件方面的工作。技术栈主要涉及Android/Linux, Java/Kotlin/JVM，Python, JavaScript/React/ReactNative，数据结构与算法等方面。热爱编程与吉他，喜欢有趣的事物和人。

**关于文章**

>作者的文章首发在[Github](https://github.com/guoxiaoxing)上，也会发在[简书](http://www.jianshu.com/users/66a47e04215b/latest_articles)与[CSDN](http://blog.csdn.net/allenwells)平台上，文章内容主要包含Android/Linux, Java/Kotlin/JVM，Python, JavaScript/React/ReactNative, 数据结构与算法等方面的内容。如果有什么问题，也欢迎发邮件与我交流。

## 变量

Kotlin也采用了类似JavaScript声明变量的方式，采用var关键字声明变量，该关键字声明变量的时候并不指定变量的类型，而是根据
赋值动态决定类型。

```
var price = 10;//Kotlin会自动推测它是一个Int型的
```
当然我们也可以指定它的类型

```
var price : Int = 10;//Kotlin会自动推测它是一个Int型的
```
可以看出，Kotlin同时吸收了Java（强类型）与JavaScript（弱类型）声明变量的特点。

## 类型

>在Kotlin中，一切即对象，包括函数也是对象的一种。

### Numbers

Kotlin处理数字的方式与Java很相似，但又有所不同，Kotlin内置了以下5种数字类型。

|类型 |位宽
|:-----|:----|
|Double	|64
|Float	|32
|Long	|64
|Int	|32
|Short	|16
|Byte	|8

**举例**

```java
Decimals: 123
Longs are tagged by a capital L: 123L
Hexadecimals: 0x0F
Binaries: 0b00001011
Doubles by default: 123.5, 123.5e10
Floats are tagged by f or F: 123.5f
```
注：Kotlin目前还不支持八进制。

从1.1版本之后，我们可以在数字中插入"_"来使得数字更加易读。

```java
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010
```

关于类型转换

不同类型的数字是不能直接赋值的。

```java
// Hypothetical code, does not actually compile:
val a: Int? = 1 // A boxed Int (java.lang.Integer)
val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
print(a == b) // Surprise! This prints "false" as Long's equals() check for other part to be Long as well

val b: Byte = 1 // OK, literals are checked statically
val i: Int = b // ERROR

val l = 1L + 3 // Long + Int => Long
```
我们可以使用toInt()这样的方法来完成类型转换。

```java
val i: Int = b.toInt() // OK: explicitly widened
```
常见的转换方法有：

- toByte(): Byte
- toShort(): Short
- toInt(): Int
- toLong(): Long
- toFloat(): Float
- toDouble(): Double
- toChar(): Char

### Char

Kotlin里的字符用Char来表示


### String

Kotlin里的字符串用String来表示

创建String，还可以用in表达式迭代字符串里的字符

```java
val str = "Hello, world!\n"

for (c in str) {
    println(c)
}
```

### Booleans

布尔类型的变量有两个值：true与false。

### Array

Kotlin中的数组用Array表示，Array有一个set方法与get方法以及一个iterator。

```java
class Array<T> private constructor() {
    val size: Int
    operator fun get(index: Int): T
    operator fun set(index: Int, value: T): Unit

    operator fun iterator(): Iterator<T>
    // ...
}
```

创建数组

```java
// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
val asc = Array(5, { i -> (i * i).toString() })

// Get element from array
asc[0]
asc.get(0)
```
我们还可以创建特定类型的数组，例如：ByteArray, ShortArray, IntArray

```java
val x: IntArray = intArrayOf(1, 2, 3)
x[0] = x[1] + x[2]
```

## 语句

Kotlin提供了很多有趣的关键字与表达式，它们使得语法更加简便。

### in

判断一个对象是否在某一个区间内，可以使用in关键字

```java
for()
```
### $

美元符可以在字符串中引用变量的值。

```java
al i = 10
val s = "i = $i" // evaluates to "i = 10"

val s = "abc"
val str = "$s.length is ${s.length}" // evaluates to "abc.length is 3"
```
这是个有用的特性

## if语句

if语句和Java相比没有太大变化，可以用{}标明代码块，也可以不写。

```java

```