package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!!!");
        Singleton newSing = Singleton.getInstance();

        System.out.println(newSing.toString());
    }
}
