package com.derbysoft.kotlin

import org.junit.Assert


    class Assertion<T>(private val target: T) {
        infix fun isEqualTo(other: T) {
            Assert.assertEquals(other, target)
        }

        infix fun isDifferentFrom(other: T) {
            Assert.assertNotEquals(other, target)
        }
    }

    infix fun String.substringMatches(r: Regex) : List<String> {
        return r.findAll(this)
                .map { it.value }
                .toList()
    }

    fun main(args: Array<String>) {
        val result = Assertion(5)

        result isEqualTo 5 // This passes
        result isEqualTo 6 // This fails the assertion
        result isDifferentFrom 5 // This also fails the assertion

        val matches = "a bc def" substringMatches ".*? ".toRegex()
        Assert.assertEquals(listOf("a ", "bc "), matches)
    }