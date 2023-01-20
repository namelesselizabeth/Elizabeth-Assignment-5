package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	
	public static final int DEFAULT_ARRAY_VALUE = 10;
	Object[] items = new Object[10];
	
	public Object[] increaseItemsArray() {
		
		Object[] tempItems = new Object[items.length*2];
		for(int i = 0; i< items.length; i++) {
			
			tempItems[i] = items[i];
		}
		return tempItems;
	}

	@Override
	public boolean add(T item) {
		
		boolean check = false;
		
		for(int i = 0; i < items.length; i++) {
			while(check) {
			
				if(items[i] == null) {
					check = true;
					items[i] = item;
			}
				
			else {
				check = false;
				}
			}
		}
		return true;
		
	}

	@Override
	public int getSize() {
		int size = 0;
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null) {
				size++;
			}
		}
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		return (T) items[index];
	}
	
}