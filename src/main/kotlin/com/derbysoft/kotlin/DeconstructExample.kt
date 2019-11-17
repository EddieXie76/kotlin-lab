package com.derbysoft.kotlin


    data class PointXYZ(val x: Double, val  y: Double, val z: Double)

    fun main(args: Array<String>) {
        val (x, y, z) = PointXYZ(100.0, 200.0, 50.0)
        println("x = $x, y = $y, z = $z")
    }
