package com.tngtech.archunit.core.importer.testexamples.classhierarchyimport;

public class SubSubClass extends SubClass {
    private String printMe = "NoOp";

    void doSomethingSubSub() {
        System.err.println(printMe);
    }
}
