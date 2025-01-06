package string;

public class stringprogram {

	public static void main(String[]args) 
	
	{
		
		small();
	}
		
	
	
	public static void reverseString ()
		{	
		String s1="rubesh";
		
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)  
		{
			rev=rev+s1.charAt(i);
		}
		
		System.out.print(rev);
	
		}
	
	
	
	
	
	public static void palindrome()
	{
		String a1="Mom";
		
		String rev="";
		
		System.out.println();
		
		for (int i=a1.length()-1;i>=0;i--)
		{
			rev=rev+a1.charAt(i);
		}
		
		if (a1.equalsIgnoreCase(rev))
		{
			System.out.println("the given string is palindrome");
		}
		
		else
		{
			System.out.println("the given string is not palindrome");
		}
	}
	
	
	public static void small()
	{
		
		String c="virat kholi";
		
		String v=" I LOVE INDIA ";
		
		 System.out.println(c.substring(5));  // kholi
		 
		 System.out.println(c.substring(0, 5));  //(end-1) (5-1)=4  virat
		 
		 System.out.println(v.concat(c));
		 
		 System.out.println(c.contains("vir"));
		 
		 System.out.println(v.trim());
		 
		 System.out.println(c.toUpperCase());
		 
		 
		 
	}
	
	
	
		
		

	

}
