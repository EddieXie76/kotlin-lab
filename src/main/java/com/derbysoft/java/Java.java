package com.derbysoft.java;

import java.util.ArrayList;
import java.util.List;

public class Java {
    public static void sayHello(String firstName) {
        sayHello(firstName, "", "", "Mr or Ms");
    }
    public static void sayHello(String firstName, String lastName) {
        sayHello(firstName, lastName, "", "Mr or Ms");
    }

    public static void sayHello(String firstName, String lastName, String title) {
        sayHello(firstName, lastName, "", title);
    }

    public static void sayHello(String firstName, String lastName, String midleName, String title) {
        System.out.println(String.format("Hello %s %s %s",  firstName, lastName));
    }

    public static void main(String[] args) {
//        Java.sayHello("Jane");
//        Java.sayHello("Jane", "Doe");
//        Java.sayHello("Jane", "Doe", "Mr");
//        Java.sayHello("Jane", "Doe", "X", "");
//
//
        List<String> integerStringList = new ArrayList<>();
        integerStringList.add("1234");
        integerStringList.add("5678");
        integerStringList.add("abc");
        int sum = integerStringList.stream().mapToInt(Integer::parseInt).sum();
//        System.out.println(sum);

        System.out.println();
    }

    public class Foo {
        public String foo(){ return "Base Foo"; }
    }

    public class Bar {
        public String bar(){ return "Base Bar"; }
    }

    public class Derived{
        private Foo foo;
        private Bar bar;
        public Derived(Foo foo, Bar bar) {
            this.foo = foo;
            this.bar = bar;
        }
        public String foo() { return foo.foo(); }

        public String bar(){ return bar.bar(); }
    }

    private String xml = "" +
            "<OTA_HotelAvailRQ xmlns=\"http://www.opentravel.org/OTA/2003/05\"\n" +
            "  EchoToken=\"HA\" TimeStamp=\"2019-10-26T06:14:31.921+00:00\"\n" +
            "  Target=\"Production\" Version=\"2.001\" PrimaryLangID=\"EN\">\n" +
            "\t<POS>\n" +
            "\t\t<Source>\n" +
            "\t\t\t<RequestorID Type=\"13\" ID=\"JAC\" ID_Context=\"TARS\"/>\n" +
            "\t\t</Source>\n" +
            "\t</POS>\n" +
            "</OTA_HotelAvailRQ>";


}
