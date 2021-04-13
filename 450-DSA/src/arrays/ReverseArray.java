package arrays;

import java.io.*;

public class ReverseArray {

    /* Iterative way = > 	1)Initialize start=0,end = n-1 
							2)swap elements as arr[start] with arr[end] 
							and change positions of start and end as start+=1, end-=1
								*/
    static void rvereseArray(int arr[],int start,int end) {
    	
    	int temp;
    	while(start < end) {
    		temp = arr[start];
    		arr[start] = arr[end];
    		arr[end] = temp;
    		start++;
    		end--;
    	}
    }
    
    /* Recursive way = > 	1)Initialize start=0,end = n-1 
							2)swap elements as arr[start] with arr[end] 
							3)Recursively call reverse for rest of the array.
		*/
    static void rvereseArrayRecursive(int arr[],int start,int end) {
    	
    	int temp;
    	
    	if(start >= end)//termination condition
    		return;
    	
    	temp = arr[start];
    	arr[start] = arr[end];
    	arr[end] = temp;
    	rvereseArrayRecursive(arr, start+1, end-1);//Recursive function rvereseArrayRecursive() call
    }
    
    /* Utility that prints out an array on a line */
    static void printArray(int arr[],int size)
    {
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
          
         System.out.println();
    }


    public static void main(String[] args) throws IOException {

       int arr[] = {10, 20, 30, 40, 50, 60};
       //Iterative way
       rvereseArray(arr, 0, 5);
       printArray(arr, 6);
       //Recursive way
       rvereseArrayRecursive(arr, 0, 5);
       printArray(arr, 6);
        
    }
}
