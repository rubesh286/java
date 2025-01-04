package arrays;

class matric
{
	
	public static void main (String[]args)
	{
		int a[][]= {{1,2,3},                  //  0   1    2
					{4,5,6},				  //  1
					{7,8,9}	          		  //  2	
				   };
	
		for(int i=0;i<a.length;i++) // 0<3
		{
			for(int j=0;j<a[i].length;j++)  // 0<3
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
	
	}
	}