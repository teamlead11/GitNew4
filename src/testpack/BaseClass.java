package testpack;

import java.util.Arrays;
import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my modified base class by RAJESH KANNA");
		BaseClass rajesh=new BaseClass();
		rajesh.arraySortByRajesh();
		rajesh.arraysortByGowthaman();
	}
public void arraySortByRajesh()
{
	 int n, temp;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter no. of Integer Value you want in array:");
     n = s.nextInt();
     int a[] = new int[n];
     System.out.println("Enter all the Integer Values:");
     for (int i = 0; i < n; i++) 
     {
         a[i] = s.nextInt();
     }
     for (int i = 0; i < n; i++) 
     {
         for (int j = i + 1; j < n; j++) 
         {
             if (a[i] > a[j]) 
             {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
         }
     }
     System.out.print("Ascending Order:");
     for (int i = 0; i < n - 1; i++) 
     {
         System.out.print(a[i] + ",");
     }
     System.out.print(a[n - 1]);
 }

public static void arraysortByGowthaman() {
	int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
	  
    Arrays.sort(arr); 

    System.out.printf("Modified arr[] : %s", 
                      Arrays.toString(arr)); 
	
	

}



}
