package com.string;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String str = "Hello My Java World";
		String[] words = str.split("\\s");
		String revString = "";
		
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for(int j = word.length()-1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println("Reverse Each Word : " + revString);
	}

}
