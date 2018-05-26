package pl.narodzinyprograsmity.praca1;

public class Solution {
    private static final int SPECIAL_NUMBER_11 = 11;
    private static final int FINDING_NUMBER = 1;

    private int tempNumber;
    private int result = 0;


    public int solution(int n) {
        int numberSize;
        if (n < 0) return 0;

        for (int i = 1; i <= n; i++) {
            numberSize = String.valueOf(i).length();
            if (i == 1) {
                result++;
            } else if (isNotChar1(numberSize)) {
                for (int j = 0; j < numberSize; j++) {
                    tempNumber = (int) (i % Math.pow(10, j + 1));
                    if (isNormalNumberContainsNum1() || isSpecialNumber(i)) {
                        result++;
                    }
                }
            }
        }
        return result;

    }

    private boolean isSpecialNumber(int i) {
        return i == SPECIAL_NUMBER_11;
    }

    private boolean isNormalNumberContainsNum1() {
        return isContainsChar1() && isNotChar1(tempNumber);
    }

    private boolean isNotChar1(int tempNumber) {
        return tempNumber != FINDING_NUMBER;
    }

    private boolean isContainsChar1() {
        return String.valueOf(tempNumber).contains("1");
    }
}
