package com.bootcoding.leetcode;
import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies
{
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        // Check if each kid can have the greatest number of candies
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }

    //another approach.
    private static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        // get max
        int max = 0;
        for (int candy: candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy: candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
