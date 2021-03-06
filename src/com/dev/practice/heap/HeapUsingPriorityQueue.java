package com.dev.practice.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapUsingPriorityQueue {

	public static void main(String[] args) {

		int[] arr = { 10, 7, 11, 5, 2, 13, 1, 45 };

		HeapApp.minHeap(arr);
		HeapApp.maxHeap(arr);

	}

	static class HeapApp {

		public static void minHeap(int[] arr) {
			PriorityQueue<Integer> heap = new PriorityQueue<>();
			System.out.println("Min Heap :");
			for (int i = 0; i < arr.length; i++) {
				heap.add(arr[i]);
				System.out.print(heap.peek() + " ");
			}

			System.out.println();
			System.out.println("Min Heap :");
			for (int i = 0; i < arr.length; i++) {
				heap.poll();
				System.out.print(heap.peek() + " ");
			}

			System.out.println();
		}

		public static void maxHeap(int[] arr) {
			PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

			System.out.println("Max Heap :");
			for (int i = 0; i < arr.length; i++) {
				heap.add(arr[i]);
				System.out.print(heap.peek() + " ");
			}

			System.out.println();

			System.out.println("Max Heap :");
			for (int i = 0; i < arr.length; i++) {
				heap.poll();
				System.out.print(heap.peek() + " ");
			}

			System.out.println();
		}

	}
}
