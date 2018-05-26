package pl.narodzinyprograsmity.staz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SzachownicaTest {
    private Szachownica szachownica;
    private String[] argumnts;

    @Test
    public void goodArg() {
        argumnts = new String[]{"2", "2", "3", "4", "X", "O"};
        szachownica = new Szachownica(argumnts);
        szachownica.draw();
    }

    @Test
    public void wrongNumber() {
        argumnts = new String[]{"0", "3", "4", "5", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test10() {
        argumnts = new String[]{"test", "2", "3", "4", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test9() {
        argumnts = new String[]{"2", "test", "3", "4", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test8() {
        argumnts = new String[]{"2", "3", "test", "16", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test7() {
        argumnts = new String[]{"2", "3", "4", "test", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test6() {
        argumnts = new String[]{"2", "3", "4", "16", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test5() {

        argumnts = new String[]{"2", "3", "16", "5", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test4() {
        argumnts = new String[]{"2", "16", "4", "5", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void name() {
        argumnts = new String[]{"16", "3", "4", "5", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test3() {
        argumnts = new String[]{"2", "3", "4", "0", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void test1() {
        argumnts = new String[]{"2", "0", "4", "5", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }

    @Test
    public void tet2() {
        argumnts = new String[]{"2", "3", "0", "5", "X", "O"};
        szachownica = new Szachownica(argumnts);
    }
}