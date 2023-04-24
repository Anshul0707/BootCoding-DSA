package com.bootcoding.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);
    }

    private static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        for (int i : arr) {
            if(elementCountMap.containsKey(i)) {
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else {
                elementCountMap.put(i, 1);
            }
        }
        int r=0;
        int array []=new int[elementCountMap.size()];
        for (Map.Entry<Integer,Integer> map: elementCountMap.entrySet()) {
         array[r]=map.getValue();
         r++;
        }

        Set<Integer> set = new HashSet<>();
        for (int res : array) {
            set.add(res);
            if (set.size() == elementCountMap.size()) {
                return true;
            }
        }
        return false;
    }
}
