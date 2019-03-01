	package testpack;
import java.util.Scanner;

public class BaseClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass rajesh = new BaseClass();
		rajesh.arraySortByRajesh();
		rajesh.arrayvisalvani();
		System.out.println("this is my modified base class");
		rajesh.arraySortByVignesh();
		System.out.println("this is my modified base class by RAJESH KANNA");
		rajesh.sortingArray();
		System.out.println("***Sorted Array by Nirmal****");
		System.out.println("***RAGAV****");
		//String S="Raghav";
		//int i= S.length();
		//System.out.println(i);
		//for (int J=0;J<S.length();J++) {
			//if(S.charAt(J)=='a') {
				//System.out.println(J);
		//	}
		//}
			 
			 //Exit (Need to check with positive and negative values
			 //for (char i='A';i<10;i++) {
				 //if(i=='A') {
				//	 System.exit('g');
				// }
				// System.out.println(i);
			 //}
			 //System.out.println("END");
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
	}
	