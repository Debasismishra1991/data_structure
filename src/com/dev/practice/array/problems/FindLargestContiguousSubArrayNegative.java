package com.dev.practice.array.problems;

class ArrayImpl {

	/*
	 * It'll return Largest Contiguous Subarray Sum present in given array
	 */
	public int largestContiguousSubArrayNegative(int[] a) {
		int max_so_far, current_max;
		max_so_far = current_max = a[0];

		for (int i = 1; i < a.length; i++) {
			current_max = Math.max(a[i], current_max + a[i]);
			max_so_far = Math.max(current_max, max_so_far);
		}

		return max_so_far;
	}

	public int largestContiguousSubArrayNegativeWithIndexes(int[] a) {
		int max_so_far, current_max;
		max_so_far = current_max = a[0];
		int start = 0, end = 0, s = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > current_max + a[i]) {
				current_max = a[i];
				s = i;
			} else {
				current_max = current_max + a[i];
			}

			if (current_max > max_so_far) {
				max_so_far = current_max;
				start = s;
				end = i;
			}
			System.out.println(" Max :" + max_so_far);
			System.out.println(" Indexes from : " + start + " to : " + end);
		}

		return max_so_far;
	}
}

public class FindLargestContiguousSubArrayNegative {

	public static void main(String[] args) {

		ArrayImpl a = new ArrayImpl();
		int arr[] = { -3, -4, 4, -1, -2, 1, 5, -3 };

		System.out.println(a.largestContiguousSubArrayNegative(arr));
		System.out.println(a.largestContiguousSubArrayNegativeWithIndexes(arr));
	}

}