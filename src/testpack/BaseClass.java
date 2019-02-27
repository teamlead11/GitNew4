package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my modified base class");
		BaseClass ramesh=new BaseClass();
		ramesh.lengthofarraybyramesh();
		
	}
	public void lengthofarraybyramesh() {
		// TODO Auto-generated method stub
	     Scanner r = new Scanner(System.in);
	     System.out.print("Enter length of array = ");
	     int length = r.nextInt();
		int[] ram=new int[length];
		int size = ram.length;
		System.out.println("Length of Array = "+size);
		
	}

}
