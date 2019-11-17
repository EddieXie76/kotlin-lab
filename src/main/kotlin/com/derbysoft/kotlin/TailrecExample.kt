package com.derbysoft.kotlin

tailrec fun sumNonTailRec(number: Int): Int = when {
    number <= 1 -> 1
    else -> number + sumNonTailRec(number - 1)
}

tailrec fun sum(number: Int, acc: Int = 0): Int = when {
    number < 1 -> acc
    else -> sum(number - 1, acc + number)
}

val eps = 1E-10

tailrec fun findFixPoint(x: Double = 1.0): Double {
    return if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
}

fun main(args: Array<String>) {

    val number = 50000
    println(sum(number))
    println(sumNonTailRec(number))
//    println(findFixPoint())
}