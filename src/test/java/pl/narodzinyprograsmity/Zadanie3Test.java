package pl.narodzinyprograsmity;

import org.junit.Before;
import org.junit.Test;
import pl.narodzinyprograsmity.praca1.Zadanie3;

import static org.junit.Assert.*;

public class Zadanie3Test {

    private Zadanie3 zadanie3;

    @Before
    public void setUp() {
        zadanie3 = new Zadanie3();
    }

    @Test
    public void first() {
        int result = zadanie3.solution("ACAX");
        assertEquals(16, result);
    }

    @Test
    public void second() {
        int result = zadanie3.solution("CODILITY");
        assertEquals(96, result);
    }

    @Test
    public void test3() {
        int result = zadanie3.solution("aca");
        assertEquals(7, result);
    }
}