package testpack;

import java.util.Scanner;

public class BaseClass {
	public void arraySortByVignesh() {
		
		System.out.println("Enter 5 Values : ");
		Scanner sc=new Scanner(System.in);
		
	int a[]=new int[5];
	int temp;
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Ascending Order :");
	for(int i=0;i<5;i++)
	{
		for(int j=i+1;j<5;j++)
		
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		
		}
	}
	for(int i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass Vikki =new BaseClass();
		System.out.println("this is my modified base class");
		Vikki.arraySortByVignesh();
	}

}
