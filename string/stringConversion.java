package string;

public class stringConversion {
	
	public static void main (String[]args)
	{
		String s1="rajaram";
		
		String s2="ramani";
		
		System.out.println(s1.length());
		
		System.out.println(s2.length());  // length () ---> for string type
		
		char[] ch=s1.toCharArray();  // after conversion to check we are using length
		
		System.out.println(ch.length);  // length -----> for char
		
		char[] hc=s2.toCharArray();
		
		System.out.println(hc.length);
	}

}
