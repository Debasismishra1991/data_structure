package com.dev.practice.heap;
import java.util.PriorityQueue;

public class ConnectRopeWithMinimumCost {
  
  public static int connectRopeWithMinimumCost(int[] ropes) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for(int i = 0; i < ropes.length; i++) {
      minHeap.add(ropes[i]);
    }
    
    int minCost = 0;
    
    while(minHeap.size() > 1) {
      
      int tempCost = minHeap.poll() + minHeap.poll();
      minCost = minCost + tempCost;
      
      minHeap.add(tempCost);
    }
    
    return minCost;
  }
  
  public static void main(String[] args) {
    int arr[] = {3, 4, 7, 2};
    System.out.println(ConnectRopeWithMinimumCost.connectRopeWithMinimumCost(arr));
  }
}