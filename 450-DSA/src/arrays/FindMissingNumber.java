package arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		System.out.println(findMissing(arr)); 
	}

	public static int findMissing(int[] nums) {

		/*
		 * Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2 Create a
		 * variable sum to store the sum of array elements. Traverse the array from
		 * start to end. Update the value of sum as sum = sum + array[i] Print the
		 * missing number as sumtotal – sum
		 */
		
		int n = nums.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++)
			sum -= nums[i];
		return sum;
	}

}
