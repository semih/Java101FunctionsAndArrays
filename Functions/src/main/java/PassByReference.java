package main.java;

public class PassByReference {

    public static void modify (Foo a1, Foo b1) {
        a1.number++;

        b1 = new Foo(1);
        b1.number++;
    }

}
