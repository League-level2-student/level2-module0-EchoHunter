package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random r = new Random();
		//1. make an array of 5 Strings
		String[] names = new String[5];
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = ("melissa");
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] num = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int b = 0; b < 50; b++) {
			num[b]=r.nextInt(200);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int d = 1000;
		for (int c = 0; c < 50; c++) {
			if(num[c] < d) {
				d = num[c];
			}
			
		}
		System.out.println(d);
		//9 print the entire array to see if step 8 was correct
		for (int b = 0; b < 50; b++) {
			
		
		System.out.println(num[b]);
		}
		//10. print the largest number in the array.
		int a = 0;
		for (int v = 0; v < 50; v++) {
			if(num[v] > a) {
				a = num[v];
			}
			
			
		}
		System.out.println(a);
	}
}
