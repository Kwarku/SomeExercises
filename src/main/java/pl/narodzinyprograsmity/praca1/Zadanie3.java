package pl.narodzinyprograsmity.praca1;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {


    public int solution(String S) {
        String ourString = makeBigLetter(S);
        int result = 0;

        for (int i = 0; i < ourString.length(); i++) {
            for (int j = i; j < ourString.length(); j++) {
                String substring = ourString.substring(i, j + 1);
                int temp = isUniqueLetter(substring);
                result += temp;
            }
        }
        return result;
    }

    private String makeBigLetter(String string) {
        return string.toUpperCase();
    }


    private int isUniqueLetter(String string) {
        int uniqueLetter = 0;
        boolean isUnique = true;
        List<String> letterList = new ArrayList<>();
        char[] list = string.toCharArray();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i == j) break;
                else if (list[i] == list[j]) isUnique = false;
            }
            if (isUnique){
                uniqueLetter++;
                letterList.add(String.valueOf(list[i]));
            }



        }
       
        return uniqueLetter;
    }
}
