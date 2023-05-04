package com.bootcoding.leetcode;

public class SortThePeople {
    public static void main(String[] args) {
        String [] names={"Mary","John","Emma"};
        int [] heights={180,165,170};
        String[] strings = sortPeople(names, heights);
        for (String res : strings) {
            System.out.println(res);
        }
    }

    private static String[] sortPeople(String[] names, int[] heights) {
        int temp;
        String temp2;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1; j < heights.length ; j++) {
                if (heights[i]<heights[j]){

                    temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;

                    temp2=names[i];
                    names[i]=names[j];
                    names[j]=temp2;
                }
            }
        }
        return names;
    }
}
