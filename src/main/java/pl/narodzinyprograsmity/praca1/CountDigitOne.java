package pl.narodzinyprograsmity.praca1;

import java.util.ArrayList;
import java.util.List;

public class CountDigitOne {
    private List<String> list = new ArrayList<>();


    public int count(int n) {
        int result = 0;
        makeList(n);

        char[] lista;

//        list.stream().filter()

        for (String element : list) {
            lista = element.toCharArray();
            for (char digit : lista) {
                if (String.valueOf(digit).equals("1")) {
                    result++;
                }
            }
        }

        return result;
    }

    private void makeList(int n) {
        for (int i = 1; i <= n; i++) {
            String element = String.valueOf(i);
            if (element.contains("1")) {
                list.add(element);
            }
        }
    }
}
