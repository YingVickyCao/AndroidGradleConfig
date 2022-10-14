package org.example;

import org.example.a.A;

public class Main {
    public static void main(String[] args) {
        System.out.println(A.name());
        System.out.println(A.getNameOfB());
//        System.out.println(new A().createB().getName());
    }
}