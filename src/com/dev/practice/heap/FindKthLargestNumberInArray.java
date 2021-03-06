package com.dev.practice.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestNumberInArray {
	
	//Time Complexity : KlogK + (N-K)logK 
	public static int kthLargestElementInGivenArrayMinHeap(int[] arr, int k) {
		if (arr.length < k) {
			System.out.println("Invalid Case");
			return -1;
		}

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			minHeap.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (arr[i] > minHeap.peek()) {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}

		return minHeap.peek();
	}
	
	// Time Complexity : O(N) + KlogN 
	public static int kthLargestElementInGivenArrayMaxHeap(int[] arr, int k) {
		if (arr.length < k) {
			System.out.println("Invalid Case");
			return -1;
		}

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			maxHeap.add(arr[i]);
		}

		for (int i = 0; i < k - 1; i++) {
			maxHeap.poll();
		}

		return maxHeap.peek();
	}

	public static void main(String[] args) {

		int[] arr = { 10, 7, 11, 30, 20, 38, 2, 45 };
		int k = 3;

		System.out.println(FindKthLargestNumberInArray.kthLargestElementInGivenArrayMinHeap(arr, k));
		System.out.println(FindKthLargestNumberInArray.kthLargestElementInGivenArrayMaxHeap(arr, k));

	}

}