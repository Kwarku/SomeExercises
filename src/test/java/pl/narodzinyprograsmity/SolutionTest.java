package pl.narodzinyprograsmity;

import org.junit.Before;
import org.junit.Test;
import pl.narodzinyprograsmity.praca1.Solution;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void soblutionTest() {

        int result2 = solution.solution(13);

        assertEquals(6,result2);


    }

    @Test
    public void name() {
        int result = solution.solution(100);
        assertEquals(21,result);

    }

    @Test
    public void testnegative() {
        int result = solution.solution(-5);
        assertEquals(0,result);
    }
}