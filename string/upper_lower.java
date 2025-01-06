package string;

public class upper_lower {
	
	public static void main(String[]args)
	
	{
		String s1="SheEElA";
		
		char[] ch=s1.toCharArray();
		
		int ucount=0;
		
		int lcount=0;
		
		
		
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')  // S>=A && S<=Z
			{
				ucount++;
			}
			
			else
			{
				lcount++;
			}
		}
		
		System.out.println("the upper coutn is:"+ucount);
		
		System.out.println("the lower count is :"+lcount);
	}

}
