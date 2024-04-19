//  4/19/24
//  Zack Laine
//  Assignment 5

package com.coderscampus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {
//        int[] nums = new int[10];
//
//        System.out.println(nums);
        CustomArrayList<String> test = new CustomArrayList<>();
        for (int i = 0; i < 131; i++) {
            test.add("BAA" + i);
        }
        System.out.println(test.items);
        test.printAll();


        System.out.println("Number of items: " + test.getSize());
        System.out.println(test.get(71));

    }

}
