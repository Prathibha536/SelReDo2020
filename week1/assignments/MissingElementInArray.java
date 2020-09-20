package week1.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8,15};
		
		Arrays.sort(arr);
		
		//To check whether its sorted
		for (int i : arr) {
			System.out.println("After sorting: " +i);			
		}
		
		int first = arr[0];
		int last = arr[arr.length-1];
		
		
		//guessing the next number and storing in to a variable
		
		int nextItem = first +1;
		
		while(nextItem <= last)
		{   
			// return <0 then the item is not found
			if(Arrays.binarySearch(arr,nextItem)<0)
			{
				System.out.println("Missing Elements are: " +nextItem);
				
			}
			
			nextItem++;
		}
		
		
		
		/*Arrays.sort(arr);
		
		int n= arr.length+1;
		System.out.println("Array length is: " +n );
		int sum = (n*(n+1))/2;
		System.out.println("Sum of numbers is: " +sum );
		for (int i=0;i<arr.length;i++) {
			sum =sum - arr[i];
			
		}
		System.out.println("Missing Number is:" +sum);*/
		
	}

	}


