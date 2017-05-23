package com.guoxiaoxing.kotlin.demo.i_introduction._6_Data_Classes

import com.guoxiaoxing.kotlin.demo.util.TODO
import com.guoxiaoxing.kotlin.demo.util.doc6

fun todoTask6(): Nothing = TODO(
    """
        Convert 'JavaCode6.Person' class to Kotlin.
        Then add a modifier `data` to the resulting class.
        This annotation means the compiler will generate a bunch of useful methods in this class: `equals`/`hashCode`, `toString` and some others.
        The `task6` function should return a list of persons.
    """,
    documentation = doc6(),
    references = { com.guoxiaoxing.kotlin.demo.i_introduction._6_Data_Classes.JavaCode6.Person("Alice", 29) }
)

class Person

fun task6(): List<Person> {
    todoTask6()
    return listOf(/*Person("Alice", 29), Person("Bob", 31)*/)
}

