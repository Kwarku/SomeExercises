package pl.narodzinyprograsmity.staz;

import org.junit.Test;

public class KosmolotTest {
    private Kosmolot kosmolot;
    private String[] args;


    @Test
    public void correctWithShield() {
        args = new String[]{"4", "Y"};
        Kosmolot kosmolot = new Kosmolot(args);
        kosmolot.draw();

    }

    @Test
    public void correctWithoutShield() {
        args = new String[]{"5", "n"};
        Kosmolot kosmolot = new Kosmolot(args);
        kosmolot.draw();
    }

     @Test
    public void test1() {
        args = new String[]{"0", "N"};
        Kosmolot kosmolot = new Kosmolot(args);
        kosmolot.draw();
    }

     @Test
    public void test2() {
        args = new String[]{"5", "c"};
        Kosmolot kosmolot = new Kosmolot(args);
        kosmolot.draw();
    }

     @Test
    public void test3() {
        args = new String[]{"76", "N"};
        Kosmolot kosmolot = new Kosmolot(args);
        kosmolot.draw();
    }


}