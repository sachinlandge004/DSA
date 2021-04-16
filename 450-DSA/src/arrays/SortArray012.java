package arrays;


public class SortArray012 {
	
	static void sortArray012(int arr[],int n) {
		
		int counter0=0,counter1=0,counter2=0,i;
		
		
		for (i = 0; i < n; i++) {
			//Count 0s,1s and 2s when element in found as 0,1 and 2
			switch (arr[i]) {
			case 0:
				counter0++;
				break;
			case 1:
				counter1++;
				break;
			case 2:
				counter2++;
				break;
				
			default:
				break;
			}
			
		}
		
		 // Update the array
        i = 0;
        
     // Store all the 0s in the beginning
        while (counter0 > 0) {
            arr[i++] = 0;
            counter0--;
        }
     
        // Then all the 1s
        while (counter1 > 0) {
            arr[i++] = 1;
            counter1--;
        }
     
        // Finally all the 2s
        while (counter2 > 0) {
            arr[i++] = 2;
            counter2--;
        }
		
		
	}

	static void printArray(int arr[],int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {


		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        printArray(arr, arr_size);
        sortArray012(arr, arr_size);
        System.out.println("\nArray after seggregation ");
        printArray(arr, arr_size);

	}

}
