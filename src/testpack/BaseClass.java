package testpack;

public class BaseClass {

	public static void main(String[] args){
	
	BaseClass s = new BaseClass();
	s.arrayvisalvani();
			
	}

		void arrayvisalvani() {
		
		System.out.println("this is my modified base class");
		
		int a[] = new int[5];
a[0]=1;
a[1]=12;
a[2]=15;
a[3]=19;
a[4]=100;

		for (int i = 0; i <= a.length; i++) {
								
			System.out.println(a[i]);
		}
		
		
		
		
		
	}

}
