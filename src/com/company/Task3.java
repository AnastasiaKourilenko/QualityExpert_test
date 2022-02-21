package com.company;

import java.util.Arrays;

public class Task3 {

    public int howManyPairsOfLenses(int countOfCyclops, int[] diopters) {
        Arrays.sort(diopters);
        int countPairs = 0;
        for (int i = 0; i < diopters.length; i++) {
            if (i == diopters.length - 1) {
                countPairs++;
                break;
            }
            if (Math.abs(diopters[i] - diopters[i + 1]) < 3) {
                countPairs++;
                i++;
            } else {
                countPairs++;
            }
        }
        return countPairs;
    }
}
