package main.java;

public class PassByValue {

    public static void passByValue(int a, int b) {

        int newValueA = a; // 10
        int newValueB = b; // 11

        newValueA = 20; // 20
        newValueB = 30; // 30

        a = 100; // 100
        b = 200; // 200

    }

}
