package com.coderscampus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {
//        int[] nums = new int[10];
//
//        System.out.println(nums);
        CustomArrayList<Integer> test = new CustomArrayList<>();
        for(int i=0; i<11;i++) {
            test.add(i);
        }
        System.out.println(test.items);

    }

}
