package com.dev.practice.array.problems;

public class FindEquilibriumPointInArray {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { 0, 1, 1, 0, 2, 2, 1, 0, 2 };

		System.out.println(a.getEquilibriumPoint(arr));

	}

	static class ArrayImpl {

		/*
		 * It'll return equilibrium Point in array where sum of elements before & after
		 * it is same
		 */
		public int getEquilibriumPoint(int[] a) {
			if (a.length == 0) {
				return -1;
			}

			int sum = 0;
			int sum_so_far = 0;

			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}

			for (int i = 0; i < a.length; i++) {
				sum = sum - a[i];
				if (sum == sum_so_far) {
					return i;
				}
				sum_so_far = sum_so_far + a[i];
			}

			return -1;
		}

	}

}