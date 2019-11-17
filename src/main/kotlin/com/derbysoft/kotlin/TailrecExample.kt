package com.derbysoft.kotlin

    tailrec fun sum(n: Int): Int {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + 1
    }

fun main(args: Array<String>) {
    println(sum(5000000))
}