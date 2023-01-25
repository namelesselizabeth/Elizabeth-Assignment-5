package com.coderscampus.arraylist;

public class CustomApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		for (int i = 0; i <= 45; i++) {
			myCustomList.add("element " + i);
		}
		
		
		for(int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}
}
