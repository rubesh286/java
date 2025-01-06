package string;

import java.util.Arrays;

public class stringArray {

	public static void main(String[] args) {
		
		reves_stringArray();

	}
	
	
	public static void String_StringArray ()
	{
		String s1="god is great";
		
		String[]res=s1.split("");
		
		System.out.println(res.length);
		
		System.out.println(Arrays.toString(res)); // here tostring method is not overriden so we are calling array class for using tostring method
		
		String[] res2=s1.split(" ");
		
		System.out.println(Arrays.toString(res2));
		
		System.out.println(res2.length);
	}
	
	
	public static void reves_stringArray ()
	{
		String v1="The real Goat";
		
		String[]sa=v1.split(" ");  // converting string into string[]-array
		
		System.out.println(Arrays.toString(sa)); // arrays is a class tostring()-which is present inside a arrays 
		
		 for (int i=sa.length-1;i>=0;i--)  // this is to rev the string
		 
		 {
			 System.out.print(sa[i]+" "); 
		 }
		 
		 
		
	}

}
