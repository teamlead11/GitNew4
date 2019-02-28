package testpack;

import java.util.Arrays;
import java.util.Scanner;

public class BaseClass {
	
	
	int[] num;
	int n;
	
	
	void array() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sort an array");
		
		System.out.println("Enter values");
		n= Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter the numbers");
		num = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(scan.nextLine());
		}
	}	
		void sort() {
			Arrays.sort(num);
			
			System.out.println("\n Ascending order");
			
			for(int i=0; i<n; i++) {
				System.out.println(" "  + num[i]);
		}
	}

public static void main(String[] args) {
	
	BaseClass array1 = new BaseClass();
	array1.array();
	array1.sort();
	
	}
	
}