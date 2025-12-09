package com.hamid;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // Printing the List in different ways
        System.out.print("Way 1: ");
        for (int i = 0; i < nums.size(); i++) System.out.println(nums.get(i));

        // Another way
        System.out.print("Way 2: ");
        for(int n : nums) System.out.println(n);

        //in-built loop for List
        System.out.print("Way 3: ");
        nums.forEach(n -> System.out.println(n));
    }
}
