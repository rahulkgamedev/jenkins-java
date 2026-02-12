package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println(greet("Buddy"));
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
