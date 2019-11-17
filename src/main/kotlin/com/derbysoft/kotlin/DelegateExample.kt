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