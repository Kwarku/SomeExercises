package pl.narodzinyprograsmity;

import org.junit.Test;
import pl.narodzinyprograsmity.praca1.Solution2;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void name() {
        Solution2 test = new Solution2();
        int[] array = {3, 4, 7, 7, 6, 6};

        int result = test.solution(array);

        assertEquals(3, result);
    }

    @Test
    public void name2() {
        Solution2 solution2 = new Solution2();
        int[] array = {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};

        int result = solution2.solution(array);

        assertEquals(3, result);
    }
}