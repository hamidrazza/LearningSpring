package com.hamid;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> std = new HashMap();

        std.put("Hamid",55);
        std.put("Mahi",61);
        std.put("Mahtab",52);
        std.put("Toheed",57);

        // Gives key:value output
        //System.out.println(std);

        // Keys : Are Set
        // Values : Are List

        //Getting all the keys
        std.keySet();

        // Getting all the values
        std.values();

        //put : means add the element, if it's already exist then replace with new value
        std.put("Mahi",58); // Update the value 61 -> 58

        // Since the keys are Set, we can iterate it like this
        for (String key : std.keySet()){
            System.out.println(key + " : " + std.get(key));
        }
    }
}


