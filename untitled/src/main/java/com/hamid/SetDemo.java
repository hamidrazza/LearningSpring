package com.hamid;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args)
    {
        // Set doesn't accept repeated values...
        // HashSet -> doesn't give Sorted values
        // TreeSet -> Gives the values in Sorted
//        Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet<>();
        nums.add(21);
        nums.add(17);
        nums.add(33);
        nums.add(24);

        /*for(int n : nums){
            System.out.println(n);
        }*/

        // We also have the Iterator which gives another Iterator
        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}


