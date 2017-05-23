package com.guoxiaoxing.kotlin.demo.i_introduction._4_Lambdas

import com.guoxiaoxing.kotlin.demo.util.TODO
import com.guoxiaoxing.kotlin.demo.util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ IDEA's code completion feature.
        (Don't use the class 'Iterables').
    """,
    documentation = doc4(),
    references = { com.guoxiaoxing.kotlin.demo.i_introduction._4_Lambdas.JavaCode4().task4(collection) })

fun task4(collection: Collection<Int>): Boolean = todoTask4(collection)




