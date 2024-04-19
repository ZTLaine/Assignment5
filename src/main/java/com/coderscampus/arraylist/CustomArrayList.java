//  4/19/24
//  Zack Laine
//  Assignment 5

package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    Integer numOfItems = 0;

    @Override
    public boolean add(T item) {
        if (item != null) {
            if (numOfItems != items.length) {
                items[numOfItems] = item;
                numOfItems++;
            } else {
                Object[] tempItems = items;
                items = new Object[numOfItems * 2];
                for (int i = 0; i <= numOfItems - 1; i++) {
                    items[i] = tempItems[i];
                }
                items[numOfItems] = item;
                numOfItems++;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return numOfItems;
    }

    @Override
    public T get(int index) {
        if (index < numOfItems && index >= 0) {
            return (T) items[index];
        } else {
            System.out.println(index + " is not a valid index!");
            return null;
        }
    }

    public void printAll() {
        for (Object item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
