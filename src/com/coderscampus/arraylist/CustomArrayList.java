package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	int size = 0;
	Object[] items = new Object[10];
	
	public Object[] increaseItemsArray() {
		
		Object[] tempItems = new Object[size*2];
		for(int i = 0; i < size; i++) {
			
			tempItems[i] = items[i];
		}
		return tempItems;
	}

	@Override
	public boolean add(T item) {
		
		if(size < items.length) {
			for(int i = 0; i < items.length; i++) {
				if(items[i] == null) {
					items[i] = item;
					size++;
					break;	
				}
			}
			
			return true;
		}
		
		else {
				items = increaseItemsArray();
				for(int i = 0; i < items.length; i++) {
					if(items[i] == null) {
						items[i] = item;
						size++;
						break;	
					}
				}
				return true;
		}
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		return (T) items[index];
	}
	
}