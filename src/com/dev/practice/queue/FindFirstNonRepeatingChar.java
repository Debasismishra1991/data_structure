package com.dev.practice.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FindFirstNonRepeatingChar {

	public static void printFirstNonRepeatingCharactersInStream(char[] stream) {
		HashMap<Character, Integer> map = new HashMap<>();
		Queue<Character> queue = new LinkedList<>();

		for (int i = 0; i < stream.length; i++) {
			map.put(stream[i], map.getOrDefault(stream[i], 0) + 1);

			if (map.get(stream[i]) == 1) {
				queue.add(stream[i]);
			}

			while (!queue.isEmpty()) {
				char c = queue.peek();
				if (map.get(c) == 1) {
					break;
				} else {
					queue.remove();
				}
			}

			if (queue.isEmpty()) {
				System.out.print(-1 + " ");
			} else {
				System.out.print(queue.peek() + " ");
			}

		}

	}

	public static void main(String[] args) {

		char[] stream = { 'a', 'a', 'b', 'c', 'c', 'd', 'b', 'a', 'd' };

		FindFirstNonRepeatingChar.printFirstNonRepeatingCharactersInStream(stream);

	}

}