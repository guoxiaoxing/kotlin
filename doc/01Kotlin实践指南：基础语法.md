# Kotlin实指指南：基础语法

**关于作者**

>郭孝星，程序员，吉他手，主要从事Android平台基础架构方面的工作，欢迎交流技术方面的问题，可以去我的[Github](https://github.com/guoxiaoxing)提issue或者发邮件至guoxiaoxingse@163.com与我交流。

**文章目录**

- 一 函数和变量
- 二 类和属性
- 三 控制语句

注：文章中"举例"字样代表所举的例子，"区别"字样代码Kotlin与Java不同的地方，

更多文章请参见[文章目录](https://github.com/guoxiaoxing/kotlin)。

本篇文章是本系列文章的开篇文章，主要介绍Java中的编程概念（语句、函数、类等）是如何映射到Kotlin的代码中的。本文的目的在于帮助大家快速理解Java里的语法在Kotlin中如何实现，以及
它们之间有什么区别。

>Kotlin是一种在Java虚拟机上运行的静态类型编程语言。

- Kotlin是静态语言并且支持类型推导，允许维护正确性与性能的同时保证了源代码的简洁性。
- Kotlin支持函数式和面向对象两种编程风格，通过头等函数使得更高级别的抽象成为了可能，通过支持不可变值简化了测试和多线程并发。
- Kotlin与Java具有良好的互操作性，Kotlin可以去使用Java的API、继承Java的类型、实现Java的接口，同样的，Java也可以像调用其他Java代码那样调用Kotlin，这为语言混用打下了坚实的基础。


## 一 函数和变量

## 1.1 函数

>函数的声明以fun关键字开始，函数名称紧跟其后，然后是形参列表，形参列表后面是返回值，如果没有指定返回值，默认的返回值是Unit。

**举例**

```kotlin
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
```

可以看到在这个函数里if表达式被当做返回值直接返回，这似乎与Java不太一样，为什么会这样呢？🤔

**区别**

在Kotlin中，if是表达式，而在Java中if是语句。

- 表达式：表达式有值，并且可以作为另一个表达式的一部分使用。
- 语句：语句是包围着它的代码块的底层元素，而且它没有值。

在Java中所有的控制语句都是表达式，而在Kotlin中，除了循环（for、do与do/while）是语句外，其他大部分控制结构都是表达式，都有值。
而恰恰在Java中是表达式的赋值操作（a = 1）在Kotlin中却是语句，这样有助于避免比较操作（==）和赋值（=）操作之间的混淆。

如果函数中只有一个表达式，可以将这个表达式作为完整的函数体，称为表达式函数体，例如：

```kotlin
fun max(a: Int, b: Int): Int = if (a > b) a else b
```
## 1.2 变量

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


# 三 控制语句

Kotlin常见的控制语句有：

- 条件表达式if、when
- 异常处理try/catch、throw
- 循环表达式for/in、while与do/while

Kotlin的控制语句和Java有所区别🤔，它们具备更强大的功能，在介绍控制语句之前，我们要先理解两条规则：

- 出来循环语句外，其他表达式是有有返回值的
- 在if、when、try等代码块中，最后的表达式就是要返回的结果

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
```
Kotlin没有那种Java中常规的for循环，但是提供了更为强大的for/in循环，它可以用来变量区间、数列和集合等。

```kotlin
for (i: Int in 1..100){
    Logger.d(i)
}
```


## 数字

|Type	|Bit width|
|:------|:--------|
|Double	|64
|Float	|32
|Long	|64
|Int	|32
|Short	|16
|Byte	|8

Int?或者泛型会对数字进行自动装箱，装箱后的数字保留了相等性，但是没有保留同一性。

```kotlin
val a: Int = 10000
print(a === a) // 输出“true”
val boxedA: Int? = a
val anotherBoxedA: Int? = a
print(boxedA == anotherBoxedA) // 输出“true”
print(boxedA === anotherBoxedA) // ！！！输出“false”！！！
```
数字类型不支持隐式转换，每个数字类型都支持如下显式转换：

- toByte(): Byte
- toShort(): Short
- toInt(): Int
- toLong(): Long
- toFloat(): Float
- toDouble(): Double
toChar(): Char

Kotlin支持数字运算的标准集，它还自己的位运算操作符：

- shl(bits) – 有符号左移 (Java 的 <<)
- shr(bits) – 有符号右移 (Java 的 >>)
- ushr(bits) – 无符号右移 (Java 的 >>>)
- and(bits) – 位与
- or(bits) – 位或
- xor(bits) – 位异或
- inv() – 位非

## 字符

字符用Char表示，它们不能直接当做数字，可以调用上述方法进行显示转换。值用''括起来。支持转义序列：

- \t
- \b
- \n
- \r
- \'
- \"
- \\
- \$

若需要可空引用字符会被装箱，装箱操作不会保留同一性。

## 字符串

字符串用String类型来表示。

```
//可以使用索引运算符访问
str[i]

//可以for循环迭代字符串
for(c in str){
}

//支持模板表达式
val a = "abc"
val s1 = "i + $a"
val s2 = "i + ${a.length}"
```
## 布尔

布尔用Boolean类型表示，它有true与false两个值，支持布尔运算：

- || – 短路逻辑或
- && – 短路逻辑与
- ! - 逻辑非

若需要可空引用布尔会被装箱，装箱操作不会保留同一性。

## 数组

数组用Array表示，它定义了如下函数：

```kotlin
public class Array<T> {
    /**
     * Creates a new array with the specified [size], where each element is calculated by calling the specified
     * [init] function. The [init] function returns an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> T)

    /**
     * Returns the array element at the specified [index]. This method can be called using the
     * index operator:
     * ```
     * value = arr[index]
     * ```
     */
    public operator fun get(index: Int): T

    /**
     * Sets the array element at the specified [index] to the specified [value]. This method can
     * be called using the index operator:
     * ```
     * arr[index] = value
     * ```
     */
    public operator fun set(index: Int, value: T): Unit

    /**
     * Returns the number of elements in the array.
     */
    public val size: Int

    /**
     * Creates an iterator for iterating over the elements of the array.
     */
    public operator fun iterator(): Iterator<T>
}
```
创建方法

```
//创建一个数组并传递元素值给它
arrayOf(1, 2, 3)

// 创建一个 Array<String> 初始化为 ["0", "1", "4", "9", "16"]
val asc = Array(5, { i -> (i * i).toString() })
```

Kotlin也支持无装箱开销的专门的类来表示原生类型数组：

- ByteArray
- Shortrray
- IntArray

它们与Array没有继承关系，但是有相同的方法属性集。

```
val x: IntArray = intArrayOf(1, 2, 3)
x[0] = x[1] + x[2]
```

## 解构声明

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

### for循环解构

解构声明还可以用在for循环中：

```kotlin
、、
//变量 a 和 b 的值取自对集合中的元素上调用 component1() 和 component2() 的返回值。
for ((a, b) in collection) { …… }
```

遍历Map我们也有了更简单的方式：

```kotlin
for((key, value) in map){
````//使用key，value
}
```
标准库为了我们实现了扩展

- 通过提供一个 iterator() 函数将映射表示为一个值的序列，
- 通过提供函数 component1() 和 component2() 来将每个元素呈现为一对。

```kotlin
operator fun <K, V> Map<K, V>.iterator(): Iterator<Map.Entry<K, V>> = entrySet().iterator()
operator fun <K, V> Map.Entry<K, V>.component1() = getKey()
operator fun <K, V> Map.Entry<K, V>.component2() = getValue()

```
### lambda表达式解构

我们可以对lambda表达式参数使用解构声明语法。

```kotlin
{ a //-> …… } // 一个参数
{ a, b //-> …… } // 两个参数
{ (a, b) //-> …… } // 一个解构对
{ (a, b), c //-> …… } // 一个解构对以及其他参数
```