package arrays;

public class copy {

	public static void main(String[] args) {
		
		int a[]= {10,30,50,73,99,87};
		
		int b[]= new int [a.length];
		
		
		for (int i=0 ; i < a.length ;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("arrays copied");
		
		for (int i=0 ;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
