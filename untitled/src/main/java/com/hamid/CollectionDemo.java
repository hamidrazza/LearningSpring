package com.hamid;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(7);
        nums.add(3);
        nums.add(4);

        for(int n : nums){
            System.out.println(n);
        }

        System.out.println("Getting the value: " + nums.get(1));
        System.out.println("Getting the index: " + nums.indexOf(4));
    }
}


