**关于作者**

>郭孝星，程序员，吉他手，主要从事Android平台基础架构方面的工作，欢迎交流技术方面的问题，可以去我的[Github](https://github.com/guoxiaoxing)提issue或者发邮件至guoxiaoxingse@163.com与我交流。

**文章目录**

更多文章请参见[文章目录](https://github.com/guoxiaoxing/kotlin)。
## 函数结构

定义函数

```kotlin
//在定义函数的时候可以指定默认值
fun sum(a: Int,
        b: String = "str",
        c: Boolean = true): String{
    return a.toString() + b.toString() + c.toString()
}

fun printMethod() {
    //调用的时候也非常的灵活，对于有默认值的参数可以不传值
    Logger.d("sum(1): " + sum(1))
    //也可以单独指定某个参数的值
    Logger.d("sum(1): " + sum(1, c = false))
    Logger.d("sum(1): " + sum(1, "newStr"))
}
```

另外，如果一个函数不返回任何有用的值，它的返回类型是 Unit。Unit 是一种只有一个值——Unit 的类型。这个
值不需要显式返回。

### 可变参数

可变参数使用vararg标记

```kotlin
fun add(vararg ts: Int): Int {
    var sum = 0
    for (t in ts) {
        sum += t
    }
    return sum
}

//1 + 2 + 3 + 4 = 10
Logger.d("add(1, 2, 3, 4): " + add(1, 2, 3, 4))
```
只有一个参数可以被标记为vararg，

## 函数分类

### 中缀函数

函数还可以用中缀表示法调用：

- 它们是成员函数或者扩展函数
- 它们只有一个参数
- 它们使用infix关键字标记

### 单表达式函数

当函数只有单个表达式时，可以省略花括号直接在=号后指定代码体，返回类型可以省略，编译器可以自动推断返回类型。

```kotlin
fun sum(a: Int, b: Int) = a + b
```

```kotlin

//定义
public infix fun shl(bitCount: Int): Int

//调用
1 sh1 2
```

### 局部函数

函数内部还可以定义函数，局部函数可以访问外部函数的局部变量。

```kotlin
fun outerMethod(a: Int) {
    val out = 10

    fun innerMethod(b: Int) {
        val inn = out + 20
    }
}
```
### 泛型函数

```kotlin
fun <T> list(item: T): List<T>{

}
```
