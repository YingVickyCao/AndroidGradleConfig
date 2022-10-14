package org.example.a;

import org.example.b.B;
import org.example.c.C;

public class A {
    public static String name() {
        return "A" + " uses classes from Library " + B.name() + " and Library " + C.name();
    }

    public static String getNameOfB() {
        return B.name();
    }

    public B createB() {
        return new B();
    }
}