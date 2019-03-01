package testpack;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class BaseClass {
	int num[];
	int n;
	void ArrayMethodbySavi() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sorting the array");
		System.out.println("Enter the values");
		n=Integer.parseInt(sc.nextLine());
		System.out.println("enter the numbers");
		num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(sc.nextLine());
		}
	}
		void sort() {
			Arrays.sort(num);
			System.out.println("\n Ascending order");
			for(int i=0;i<n;i++) {
				System.out.println(" " +num[i]);
				
				
			}
		}
	
public static void main(String[] args) {
	BaseClass base = new BaseClass();
	base.ArrayMethodbySavi();
	base.sort();
}


}