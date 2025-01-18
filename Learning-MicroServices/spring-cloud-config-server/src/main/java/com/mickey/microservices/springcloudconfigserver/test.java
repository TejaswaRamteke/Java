package com.mickey.microservices.springcloudconfigserver;

public class test {

    // Inner class A
    static class A {
        void displayA() {
            System.out.println("This is class A");
        }
    }

    // Inner class B
    static class B {
        void displayB() {
            System.out.println("This is class B");
        }
    }

    public static void main(String[] args) {
        System.out.println("This is the TestClass");

        // Creating instances of inner classes and invoking their methods
        A a = new A();
        B b = new B();

        a.displayA();
        b.displayB();
    }
}