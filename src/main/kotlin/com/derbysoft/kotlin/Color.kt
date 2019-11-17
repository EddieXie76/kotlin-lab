package com.derbysoft.kotlin

    enum class Color(val rgb: Int) {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF)
    }

    fun main(args: Array<String>) {
        println(Color.RED.rgb)
    }