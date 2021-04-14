package arrays;
//Minimum and Maximum of array using minimum comparisons

public class MinMaxOfArray {

	//Pair class returns min and max elements 
	static class Pair{
		int min;
		int max;
	}
	
	//getMinMax method
	static Pair getMinMax(int arr[],int n) {
		Pair minmax = new Pair();
		int i;
		
		//If there is only one element in array then return as min and max as both
		if (n == 1) {
			minmax.max = arr[0];
			minmax.min = arr[0];
			return minmax;
		}
		
		//for more than one array elements intialize min and max
		if(arr[0] > arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
		}else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}
		
		//compare remaining array elements from 3rd element with min and max
		for(i=2; i<n;i++) {
			
			if(arr[i] > minmax.max) {
				minmax.max = arr[i];
			}else if (arr[i] < minmax.min)  {
				minmax.min = arr[i];
			}
					
		}		
		
		return minmax;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {100, 11, 445, 189, 3330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
		
	}

}
