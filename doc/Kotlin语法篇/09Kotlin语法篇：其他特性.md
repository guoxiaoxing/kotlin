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