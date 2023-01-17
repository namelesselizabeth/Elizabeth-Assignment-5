package com.coderscampus.arraylist;

public class CustomApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		myCustomList.add("element 1");
		
		for(int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}
}
