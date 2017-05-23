package com.guoxiaoxing.kotlin.demo.ii_collections

import com.guoxiaoxing.kotlin.demo.util.TODO

fun todoTask24(): Nothing = TODO(
    """
        Task 24.
        The function should behave the same as '_24_JavaCode.doSomethingStrangeWithCollection'
        Replace all invocations of 'todoTask24()' with the appropriate code.
    """,
        references = { c: Collection<String> -> com.guoxiaoxing.kotlin.demo.ii_collections._24_JavaCode().doSomethingStrangeWithCollection(c) }
)

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy { s -> todoTask24() }

    return groupsByLength.values.maxBy { group -> todoTask24() }
}

