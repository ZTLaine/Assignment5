package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Integer numOfItems = 0;

	@Override
	public boolean add(T item) {
		if(item != null){
			if(numOfItems != items.length){
				items[numOfItems] = item;
				numOfItems++;
			}
			else{
//				num
			}
		}
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
