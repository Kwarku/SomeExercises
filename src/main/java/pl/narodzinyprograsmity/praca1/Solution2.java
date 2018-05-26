package pl.narodzinyprograsmity.praca1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    private Set<Integer> set = new HashSet<>();

    private boolean isHalfOnArray = false;
    private int halfOfArray;

    public int solution(int[] array) {
        halfOfArray = array.length / 2;
        List<Integer> list = createUniqueList(array);
        removeUnnecessaryElements(list);
        return list.size();
    }

    private List<Integer> createUniqueList(int[] array) {
        List<Integer> candyTypeList = new ArrayList<>();
        for (int type : array) {
            set.add(type);
        }
        candyTypeList.addAll(set);
        return candyTypeList;
    }

    private void removeUnnecessaryElements(List<Integer> list) {
        while (!isHalfOnArray) {
            if (list.size() > halfOfArray) {
                list.remove(list.size() - 1);
            } else {
                isHalfOnArray = true;
            }
        }
    }

}
