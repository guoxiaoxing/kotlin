# Kotlin项目实践指南(下)

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

在上一篇文章[Kotlin项目实践指南(上)](https://github.com/guoxiaoxing/kotlin/blob/master/doc/Kotlin项目实践指南(上).md)中我们理解了

- 一 表达式与语句
- 二 函数和变量
- 三 类、对象和接口

接下来我们继续来理解剩下的内容。


## 四 集合



## 五 注解与泛型

## 六 类型系统

在过去的Java开发中，空指针异常令我们饱受折磨。Kotlin很好的改进了这一点，将空指针的问题控制在编阶段。Kotlin里的变量默认都是不可为空的，而对可控类型提供了显式的支持。

- 可空的类型需要用?来标记它
- 对于可空类型需要使用安全运算符?.进行调用，它将null检查与函数调用两个操作合二为一。
- Kotlin使用Elvis运算符?:来代替null的默认值
- Kotlin利用as来做类型转换，如果被转换的值不是你视图转换的类型就会抛出ClassCastException，这种情况下可以用as?，如果不是合适的类型，它会返回一个null
- Kotlin可以利用非空断言!!来把一个可空类型转换为一个非空类型，如果被转换的是个null，会抛出NullPointerException，用AS将Java代码转换成Kotlin时就会出现大量的!!，非常
的难看（写个代码就跟骂人一样，到处是叹号😤），!!这种东西就是用来提示你思考数据流的正确性。

```kotlin
val str: String?
```

## 七 Lambda与高阶函数

## 八 DSL构建