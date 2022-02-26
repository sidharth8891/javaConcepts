package test;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = { 1, 2 ,3};
		int num4[] = { 1, 2 ,3};
		String num1[] = {"a","b"};
//		int[] num2 = {1,2};
//		int number[] = new int[2];
//		number[0] = 1;
//		number[1] = 2;
//		number[2] = 3;
//		int n = num.length;
		for (int nums :num) {
			System.out.println(nums);		
		}
		
		Arrays.sort(num);
		Arrays.equals(num, num4);
		Arrays.asList(num);
		
		// Declare, Create and Initialize Array on same line
//				int marks[] = { 25, 30, 50, 10, 5 };
//				// Length of an array : Property length
//				int length = marks.length;
//
//				// Looping around an array - Enhanced for loop
//				for (int mark : marks) {
//					System.out.println(mark);
//				}
//		        // Comparing Arrays
//				int[] numbers1 = { 1, 2, 3 };
//				int[] numbers2 = { 4, 5, 6 };
//				System.out.println(Arrays.equals(numbers1, numbers2)); // false
//				int[] numbers3 = { 1, 2, 3 };
//				System.out.println(Arrays.equals(numbers1, numbers3)); // true
//
//				// Sorting An Array
//				int rollNos[] = { 12, 5, 7, 9 };
//				Arrays.sort(rollNos);
//				System.out.println(Arrays.toString(rollNos));// [5, 7, 9, 12]
				
	}
	//return array
//	 public static int[] m1()
//	    {
//	        // returning  array
//	        return new int[]{1,2,3};
//	    }
}
