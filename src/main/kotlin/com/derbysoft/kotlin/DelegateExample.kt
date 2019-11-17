package com.derbysoft.kotlin

interface Foo {
    fun foo(): String
}

interface Bar {
    fun bar(): String
}

class FooImpl : Foo {
    override fun foo(): String {
        return "Foo"
    }
}

class BarImpl : Bar {
    override fun bar(): String {
        return "Bar"
    }
}

class Derived(foo: Foo, bar: Bar) : Foo by foo, Bar by bar

class MyList<T>(private val base:ArrayList<T>) : List<T> by base{
    fun addIfMatch(element: T, matcher: Matcher<T>) {
        if (matcher.match(element)) {
            base.add(element)
        }
    }

}

interface Matcher<T> {
    fun match(t:T):Boolean
}

fun main(args: Array<String>) {
    val myList = MyList(ArrayList<String>())
    val matcher: Matcher<String> = object : Matcher<String> {
        override fun match(t: String): Boolean {
            return t.matches(Regex("\\w*"))
        }
    }

    myList.addIfMatch("XYZ", matcher)
    myList.addIfMatch("123", matcher)
    myList.forEach { println(it) }

    val list = arrayListOf<String>()
    list.add("XX")
    list.add("123")
    list.forEach { println(it) }
}