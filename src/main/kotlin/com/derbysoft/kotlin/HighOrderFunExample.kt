package com.derbysoft.kotlin

fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

typealias Point2D = Pair<Int, Int>

fun main(args: Array<String>) {
    val elements = listOf(1, 2, 3, 4, 5)
    val join = elements.fold(
            "Elements: ", { acc, it -> acc + " " + it })
    println(join)
    val sum = elements.fold(
            0, { acc, it -> acc + it })
    println("Sum:$sum")

    Point2D(1, 2)

}