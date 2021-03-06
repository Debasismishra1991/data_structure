package com.dev.practice.array.problems;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArray {

	public static void main(String[] args) {

		UnionOfTwoUnsortedArray a = new UnionOfTwoUnsortedArray();
		int arr1[] = { 4, 2, 3, 5, 4, 2, 3 };
		int arr2[] = { 9, 1, 7, 2, 4, 2, 1, 2 };
		Set<Integer> finalUnion = new HashSet<>();

		a.unionOfTwoUnSortedArray(arr1, arr2, finalUnion);
		System.out.println(finalUnion);
	}

	/*
	 * It'll return union of two unsorted array
	 */
	public void unionOfTwoUnSortedArray(int[] arr1, int[] arr2, Set<Integer> finalList) {
		int i = 0;
		int j = 0;

		while (i < arr1.length) {
			finalList.add(arr1[i++]);
		}

		while (j < arr2.length) {
			finalList.add(arr2[j++]);
		}
	}
}