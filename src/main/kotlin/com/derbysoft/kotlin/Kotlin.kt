package com.derbysoft.kotlin

object Kotlin {

    fun sayHello1(firstName: String, lastName: String) {
        println("Hello $firstName $lastName")
    }

    fun sayHello2(firstName: String, lastName: String) {
        println("Hello ${firstName + ' ' + lastName}")
    }


    fun sayHello(firstName: String, lastName: String = "", middleName: String = "", tittle: String = "Mr or Ms") {
        println("Hello ${tittle} ${firstName} ${middleName} ${lastName}");
    }


    val xml = """
            <OTA_HotelAvailRQ xmlns="http://www.opentravel.org/OTA/2003/05"
              EchoToken="HA" TimeStamp="2019-10-26T06:14:31.921+00:00"
              Target="Production" Version="2.001" PrimaryLangID="EN">
                <POS>
                    <Source>
                        <RequestorID Type="13" ID="JAC" ID_Context="TARS"/>
                    </Source>
                </POS>
            </OTA_HotelAvailRQ>
        """

}

fun main(args: Array<String>) {
//    Kotlin.sayHello("Jane")
//    Kotlin.sayHello("Jane", "Doe")
//    Kotlin.sayHello("Jane", "Doe",  "X")
//    Kotlin.sayHello("Jane", "Doe", tittle = "Ms")
//
//
//    val integerStringList = ArrayList<String>()
//    integerStringList.add("1234")
//    integerStringList.add("5678")
//    integerStringList.add("5678")
//    val sum = integerStringList.map { it.toInt() }.sum()
//    println(sum)
//    var p = Pair("A", 100)
//    var (key) = p
//    println("$key")
//    println("${p.component1()} = ${p.component2()}")
//    generateSequence(100){it+1}.take(5).forEach { println(it) }
//
//    generateSequence(1 to 1) {it.second  to it.first + it.second  }
//            .map { it.first }.take(50).forEach { print("$it ") }

//    val derived = Derived(FooImpl(), BarImpl())
//    println(derived.foo())
//    println(derived.bar())
    println(Color.RED.rgb)
}


