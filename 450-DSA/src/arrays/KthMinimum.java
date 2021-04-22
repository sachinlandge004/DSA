package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

//Solution 1 : Using sort array and return the k-1 index element (nlogn)
//Solution 2 : Using Heap MinHeap 
//Solution 3 : Using Heap MaxHeap efficient solution  (nlogk)

public class KthMinimum {

	public static void main(String[] args) {
		
		int[] arr = {7 ,10, 4, 3, 20, 15};
		int n=6,k=2;
		
		int result = kthSmallest(arr,n,k);
		System.out.println(result);
		
	}

	private static int kthSmallest(int[] arr, int n, int k) {
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for (int i = 0; i < n; i++) {

			maxHeap.add(arr[i]);		//adds elements in heap
			
			if(maxHeap.size()>k) {		//total size of heap > K  (logk)
				maxHeap.poll();			// pop the top element 
			}
			
		}
		
		return maxHeap.peek();
	}

}
