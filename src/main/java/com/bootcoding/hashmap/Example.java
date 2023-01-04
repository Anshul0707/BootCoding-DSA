package com.bootcoding.hashmap;

import java.util.HashMap;

public class Example
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Anshul",07);
        map.put("Min",13);
        map.put("Harshal",06);
        map.put("Suvi",19);

        System.out.println("Size of map: "+map.size());
        System.out.println(map);

        if (map.containsKey("Min"))
        {
            Integer anshul = map.get("Anshul");
            System.out.println("value of anshul is "+anshul);
        }
    }
}
