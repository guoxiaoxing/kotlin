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

### in关键字

判断一个对象是否在某一个区间内，可以使用in关键字

```java
/如果存在于区间(1,Y-1)，则打印OK
if (x in 1..y-1) 
  print("OK")

//如果x不存在于array中，则输出Out
if (x !in 0..array.lastIndex) 
  print("Out")

//打印1到5
for (x in 1..5) 
  print(x)

//遍历集合(类似于Java中的for(String name : names))
for (name in names)
  println(name)

//如果names集合中包含text对象则打印yes
if (text in names)
  print("yes")
```
### $操作符

美元符可以在字符串中引用变量的值。

```java
al i = 10
val s = "i = $i" // evaluates to "i = 10"

val s = "abc"
val str = "$s.length is ${s.length}" // evaluates to "abc.length is 3"
```

### ?操作符

Kotlin是空指针安全的，也就是你不用再担心Java中令人头疼的NPE问题。?标明只有当这个值不为空时才执行后续的代码。

```java
//当data不为空的时候，执行语句块
data?.let{
	//... 
}

//相反的，以下代码当data为空时才会执行
data?:let{
	//...
}
````

## if表达式

if语句和Java相比没有太大变化，可以用{}标明代码块，也可以不写。

```java
// Traditional usage 
var max = a 
if (a < b) max = b

// With else 
var max: Int
if (a > b) {
    max = a
} else {
    max = b
}
 
// As expression 
val max = if (a > b) a else b
```
## when表达式

when表达式相当于Java里的switch表达式，它使用起来更加的灵活方便。它的判断语句结构为：

常量/带返回值的函数 -> 代码块

```java
when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> { // Note the block
        print("x is neither 1 nor 2")
    }
}

when (x) {
    0, 1 -> print("x == 0 or x == 1")
    else -> print("otherwise")
}

when (x) {
    parseInt(s) -> print("s encodes x")
    else -> print("s does not encode x")
}

when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
}

fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}
```
## for表达式

for循环表达式：for (item in collection) print(item)

```java
for (i in array.indices) {
    print(array[i])
}

for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
}
```
## While表达式

While表达式同样也支持while与do..while。
```java
while (x > 0) {
    x--
}

do {
    val y = retrieveData()
} while (y != null) // y is visible here!
```
### return, break与continue

Kotlin也支持break、continue这些中断循环的语句。

return：退出当前函数
break：中断内层循环
continue：中断当前循环，继续下一次循环。

Kotlin同样也支持Java里label标签操作，不仅可以返回到定义的标签处，还可以返回值给标签。

定义标签：labelName@
返回值给标签：return@a value

```java
loop@ for (i in 1..100) {
    for (j in 1..100) {
        if (...) break@loop
    }
}

fun foo() {
    ints.forEach lit@ {
        if (it == 0) return@lit
        print(it)
    }
}

fun foo() {
    ints.forEach {
        if (it == 0) return@forEach
        print(it)
    }
}
```

## 函数

### 函数定义

Kotlin中的函数用fun关键字声明。

```java
//参数x为Int型，返回值为Int型
fun double(x: Int): Int {
}

//可以省略{}
fun double(x: Int): Int = x * 2

//返回值类型可以省略，编译器会自动推断返回值类型
fun double(x: Int) = x * 2
```
当一个函数是继承函数（override）、只有一个参数或被infix关键字标记时，可以采用它的简写方式。

```java
// Define extension to Int
infix fun Int.shl(x: Int): Int {
...
}

// call extension function using infix notation

1 shl 2

// is the same as

1.shl(2)
```

### 函数参数

函数的参数必须指定类型，且可以赋值默认值，而且函数的调用也非常的灵活，可以传递任意个数的参数给函数，这
一点雨JavaScript里的函数传参比较相似。

```java
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
...
}

//we could call this using default arguments
reformat(str)

//when calling it with non-default, the call would look something like
reformat(str, true, true, false, '_')

//we do not need all arguments
reformat(str, wordSeparator = '_')
```
子类中重载的函数要与父类中函数参数类型一直。

```java
open class A {
    open fun foo(i: Int = 10) { ... }
}

class B : A() {
    override fun foo(i: Int) { ... }  // no default value allowed
}
```
### 函数返回值

如果一个函数没有任何返回值，它会返回一个类型为Unit的返回值。

```java
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}
```
### Lambda表达式

Kotlin也支持Java新推出的Lambda表达式，这与JavaScript的箭头函数有点相似，说起来也就是一种函数
的简化写法，有点语法糖的感觉，毕竟对于初学者来说不是很直观。

Lambda表达式：参数 -> 函数体，参数可以省略，即 () -> 函数体。

Lambda表达式主要使用在高阶函数、匿名函数上。

高级函数：高阶函数将函数作为参数传递给本函数。

```java
fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}
```
匿名函数

```java
max(strings, { a, b -> a.length < b.length })
```
### 闭包

Lambda表达式或者匿名函数可以访问它范围之外声明的变量。

```java
var sum = 0
ints.filter { it > 0 }.forEach {
    sum += it
}
print(sum)
```

