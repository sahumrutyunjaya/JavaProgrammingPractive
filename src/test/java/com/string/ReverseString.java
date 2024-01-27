package com.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello World Java";
		String[] words = str.split("\\s");
		String revString = "";
		
		for(int i = 0; i < words.length; i++) {
			if(i == words.length-1) {
				revString = words[i] + revString;
			}else {
				revString = " " + words[i] + revString;
			}
		}
		System.out.println("Reverse String is : " + revString);
	}
}