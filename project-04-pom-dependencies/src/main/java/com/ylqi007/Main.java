package com.ylqi007;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // @Test --> JUnit scope
    public void test01() {
        System.out.println("When JUnit's scope is test, it cannot be used in main/java/...");
    }
}