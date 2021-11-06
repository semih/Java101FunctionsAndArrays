package test.java;

import main.java.Foo;
import main.java.PassByReference;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassByReferenceTest {

    @Test
    public void modify() {

        Foo a = new Foo(1);
        Foo b = new Foo(1);

        PassByReference.modify(a, b);
        assertEquals(a.number, 2);
        assertEquals(b.number, 1);

    }
}