package array;

public class Main {
	
	
 public static void main(String[] args) {
//	        int[] arr = new int[5];
//	        for (int i = 0; i < arr.length; i++) {
//	            arr[i] = i * 2;
//	        }
//	        System.out.println(arr[3]);
	        
	        
//	        int[] arr = {1, 2, 3, 4, 5};
//	        int sum = 0;
//	        for (int i = 0; i < arr.length; i++) {
//	            sum += arr[i];
//	        }
//	        System.out.println(sum / arr.length);
	        
	        int arr[] = {5, 3, 1, 7, 9};
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < max) {
	                max = arr[i];
	            }
	        }
	        System.out.println(max);
	    }
	}

