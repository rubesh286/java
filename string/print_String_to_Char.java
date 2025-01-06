package string;

public class print_String_to_Char {

	public static void main(String[] args) {
		
		String s1="rohitha";
		
		char[] ch=s1.toCharArray();  // string conversion to char[]
				
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
				

	}

}
