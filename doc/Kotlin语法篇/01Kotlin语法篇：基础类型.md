# Kotlin实践篇：基本类型.md

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

在Kotlin中，一切皆对象。

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

```java
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