
public class maxi {

		public static void main (String[]args)
		{
			int a[]= {100,29,76,807,64,2100,2,4};
			
			int max=a[0];   //100
			
			for (int i=1;i<a.length;i++) //1<8
			{
				if(a[i]>max) //29>100
				{
					max=a[i];
				}
			}
			
			System.out.println("biggest element in an array is :"+max);
		}
		
		
		
		
	}


