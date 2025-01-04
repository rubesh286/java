package arrays;

public class add {

	public static void main(String[] args) {
		
		int a[]= {12,100,101,87,87,10,3};
		
		int sum=0;
		
		int pro=1;
		
		System.out.println(a.length);
		
		for(int i=0;i< a.length;i++)
		
		{
			sum=sum+a[i];
			
			pro=pro*a[i];
		}
		
		System.out.println(sum);
		
		System.out.println(pro);
		
		System.out.print("odd elements in an array :");
		
		odd();
		
		
		System.out.println("sum of even number in an array");
		
		even();

		
		
	}
	
	
	public static void odd ()
	{
		int []a= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("{");
		
		for (int i=0 ; i< a.length ;i++)
		{
			if(a[i]%2 ==1)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.print("}");
		System.out.println(" ");
		
	}
	
	
	public static void even()
	{
		int a[]= {10,20,50,78,35,45,725};
		
		int sum=0;
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		
		System.out.println(sum);
	}

}
