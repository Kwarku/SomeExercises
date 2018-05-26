package pl.narodzinyprograsmity;

import org.junit.Before;
import org.junit.Test;
import pl.narodzinyprograsmity.praca1.CountDigitOne;

import static org.assertj.core.api.Assertions.assertThat;

public class CountDigitOneTest {
    private CountDigitOne countDigitOne;

    @Before
    public void setUp() {
        countDigitOne = new CountDigitOne();

    }

    @Test
    public void count() {
//        int result = countDigitOne.count(13);
        int result2 = countDigitOne.count(100);

//        assertThat(result).isEqualTo(6);
        assertThat(result2).isEqualTo(21);
    }
}