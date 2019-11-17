package com.derbysoft.kotlin

import java.io.File
import javax.xml.soap.Node


    typealias NodeSet = Set<Node>

    typealias FileTable<K> = MutableMap<K, MutableList<File>>

    typealias PointXY = Pair<Int, Int>
    class A {
        inner class Inner
    }
    class B {
        inner class Inner
    }

    typealias AInner = A.Inner
    typealias BInner = B.Inner