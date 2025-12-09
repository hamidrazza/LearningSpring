package com.hamid;

import java.util.*;
import java.util.stream.*;

public class Demo{
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        products.forEach(n -> System.out.println(n));

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> longProducts = products.stream()
                .filter(str -> (str.length() > 5))
                .map(String::toUpperCase)
                .sorted()
                .toList();
        // TODO: Print the filtered list
        longProducts.forEach(p -> System.out.println(p));
    }
}
