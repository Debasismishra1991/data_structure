package com.dev.practice.string;

import java.util.HashSet;
import java.util.Set;

public class FindNumberOfUniqueCharacters {

	public static int findUniqueCharactersString(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}

		Set<Character> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		return set.size();
	}

	public static void main(String[] args) {

		String str = "bccbababd";
		System.out.println(FindNumberOfUniqueCharacters.findUniqueCharactersString(str));
	}

}
