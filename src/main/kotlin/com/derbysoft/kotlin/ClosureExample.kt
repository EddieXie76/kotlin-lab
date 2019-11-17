package com.derbysoft.kotlin


    fun main(args: Array<String>) {
        val a = closureExample("A")
        val b = closureExample("B")
        a()
        b()
        a()
        a()
        b()
    }

    fun closureExample(name: String):()->Unit {
        var count = 0
        return fun() {
            println("$name count=${count++}")
        }
    }
