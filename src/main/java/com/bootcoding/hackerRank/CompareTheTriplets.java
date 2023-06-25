package com.bootcoding.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        ArrayList<Integer> score = new ArrayList<>();
        score.add(aliceScore);
        score.add(bobScore);
        return score;
    }
}
