package arrays;

public class largestnumber {
	
			public static void main (String[]args)
		{
			
			int a[]= {10,857,456,89,56,552,7899,55444};
			
			int larg=a[0];
			
			for (int i=0; i<a.length;i++)
			{
				if(a[i]>larg)
				{
					larg=a[i];
				}
			}
			
			System.out.println(larg);
			
		}
	

}
