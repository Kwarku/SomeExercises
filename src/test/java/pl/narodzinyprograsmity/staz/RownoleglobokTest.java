package pl.narodzinyprograsmity.staz;

import org.junit.Test;

public class RownoleglobokTest {
    private String[] arguments;
    private Rownoleglobok rownoleglobok;

    @Test
    public void correctPrintTest() {
        arguments = new String[]{"100", "2", "100"};
        rownoleglobok = new Rownoleglobok(arguments);
        rownoleglobok.draw();
    }

    @Test
    public void correctPrintTest2() {
        arguments = new String[]{"100", "3", "-2"};
        rownoleglobok = new Rownoleglobok(arguments);
        rownoleglobok.draw();
    }

    @Test
    public void test1() {
        arguments = new String[]{"0", "3", "2"};
        rownoleglobok = new Rownoleglobok(arguments);
    }

    @Test
    public void test2() {
        arguments = new String[]{"2", "0", "2"};
        rownoleglobok = new Rownoleglobok(arguments);
    }

    @Test
    public void test3() {
        arguments = new String[]{"2", "3", "0"};
        rownoleglobok = new Rownoleglobok(arguments);
    }

    @Test
    public void test4() {
        arguments = new String[]{"101", "3", "2"};
        rownoleglobok = new Rownoleglobok(arguments);
    }

    @Test
    public void test5() {
        arguments = new String[]{"2", "101", "2"};
        rownoleglobok = new Rownoleglobok(arguments);
    }

    @Test
    public void test6() {
        arguments = new String[]{"2", "3", "101"};
        rownoleglobok = new Rownoleglobok(arguments);
    }
}