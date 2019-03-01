package testpack;


import java.util.Scanner;
import java.util.Arrays;

public class BaseClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass rajesh = new BaseClass();
		rajesh.arraySortByRajesh();
		rajesh.arraysortByGowthaman();
		rajesh.arrayvisalvani();
		rajesh.arraynaveen();
		System.out.println("Element at index by naveen");
		System.out.println("this is my modified base class");
		rajesh.arraySortByVignesh();
		System.out.println("this is my modified base class by RAJESH KANNA");
		rajesh.sortingArray();
		System.out.println("***Sorted Array by Nirmal****");
		System.out.println("***RAGAV****");
		rajesh.programByRagav();
		rajesh.ArrayMethodbySavi();
		rajesh.sort();
		
		
		rajesh.lengthofarraybyramesh();
		System.out.println("Modified Class by Ramesh");
	}
		 



	public void arraySortByRajesh() {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of Integer Value you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the Integer Values:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
	}
	public void programByRagav()
	{
		 int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
		  	       
		 for (int i = 0; i < arr.length; i++) 
	        { 
	            if (arr[i] >= 5) 
	            { 
	                System.out.println("exit..."); 
	  
	                // Terminate JVM 
	                System.exit(41); 
	            } 
	            else
	                System.out.println("arr["+i+"] = " + 
	                                  arr[i]); 
	        } 
	        System.out.println("End of Program"); 
int roll =2;
switch (roll) {
case 1:
	System.out.println("jeeva");
	break;
case 2:
	System.out.println("Muthu");
	break;
case 3:
	System.out.println("Raghav");
	break;
}
	System.out.println("end");
	}

	public void sortingArray()
	{
		 int n, temp;
	     Scanner s = new Scanner(System.in);
	     System.out.print("Enter no");
	     n = s.nextInt();
	     int a[] = new int[n];
	     System.out.println("Enter all Values:");
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
	     System.out.print(" Order of ascending is:");
	     for (int i = 0; i < n - 1; i++) 
	     {
	         System.out.print(a[i] + ",");
	     }
	     System.out.print(a[n - 1]);
	 }
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
	void arrayvisalvani() {

		System.out.println("this is my modified base class");
		
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 12;
		a[2] = 15;
		a[3] = 19;
		a[4] = 100;

		for (int i = 0; i <= a.length; i++) {

			System.out.println(a[i]);
		}
		
	}
	
public void arraynaveen() {
	// TODO Auto-generated method stub

	      int[] age = {12, 4, 5, 2, 5};

	      for (int i = 0; i < 5; ++i) {
	         System.out.println("Element at index " + i +": " + age[i]);
	      }
	   }


	public void arraySortByVignesh() {

		System.out.println("Enter 5 Values : ");
		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];
		int temp;
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Ascending Order :");
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++)

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

	}

public static void arraysortByGowthaman() {
	int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
	  
    Arrays.sort(arr); 

    System.out.printf("Modified arr[] : %s", 
                      Arrays.toString(arr)); 
	
}

public void lengthofarraybyramesh() {
	
     Scanner r = new Scanner(System.in);
     System.out.print("Enter length of array = ");
     int length = r.nextInt();
     
	 int[] ram=new int[length];
	 int size = ram.length;
	 System.out.println("Length of Array = "+size);

}



	}
	

