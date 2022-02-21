package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

    private final List<Integer> DENOMINATOINS = Arrays.asList(5000, 2000, 1000, 500, 200, 100, 50, 10, 5, 2, 1);


    public void change(int price, int amount) {
//        Map<Integer, Integer> changeDenomination = new HashMap<>();
        int change = amount - price;
        while (change != 0) {
            for (Integer denomination : DENOMINATOINS) {
                if (change > denomination) {
                    int count = change / denomination;
                    System.out.println(denomination + "руб: " + count + "шт.");
//                    changeDenomination.put(denomination, count);
                    change = change % denomination;
                }
            }
        }
    }
}
