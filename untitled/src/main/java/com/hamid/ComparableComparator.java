package com.hamid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: " +
                "age=" + age +
                ", name='" + name + '\'' + '\n';
    }

    // Using this Comparable method
    // we made the student to sort itself according to the age.
    @Override
    public int compareTo(Student that) {
        // 1 -> Swap
        // -1 -> Don't Swap
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class ComparableComparator {
    public static void main(String[] args) {
        // 1 -> Swap
        // -1 -> Don't Swap
        /*Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };*/

        Comparator<Student> com1 = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };
        // We can easily replace this Comparator code using Lambda Expression
        // since, Comparator is a Functional Interface
        // We use Ternary Operator here, Look how cool the Lambda Expression is

        Comparator<Student> com2 = (i, j) -> i.age > j.age ? 1 : -1;

        // Integer are sorted because it's implement Comparable.
     /*   List<Integer> nums = new ArrayList<>();

        nums.add(22);
        nums.add(17);
        nums.add(53);
        nums.add(45);*/


        List<Student> stud = new ArrayList<>();
        stud.add(new Student(21, "Hamid"));
        stud.add(new Student(18, "Wasim"));
        stud.add(new Student(22, "Toheed"));
        stud.add(new Student(20, "Hamraj"));

        // Now we made the Student to compare itself by implementing 'Comparable' interface
        Collections.sort(stud);
        System.out.println(stud);

        // This one will sort the values
        // But if we want to sort using our own method
        // like, sort by the last digit of numbers 13, 32 will be sort 3(2), 1(3)
        //Collections.sort(nums);

        // So for comparing we have to pass the comparable obj.
        //Collections.sort(nums,com);

        //System.out.println(nums);

        // TASK: Create the ArrayList of (String) and sort
        // on the basis of the length of the string
    }
}
