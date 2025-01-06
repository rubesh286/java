package string;

class string
{

	
	public static void main(String[]args)
	{
		m1();	
	
		m2();	
	}
	
    public static void m1 ()
    
    {

	String s1="ram";
	
	String s2="Ram";
	
	String s3="hi";
	
	System.out.println(s1);
	
	System.out.println("hi");
	
	System.out.println(s1==s2);
	
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s3.concat(" "+s1));
	
    }
    
    
    public static void m2()

     {
    	String s1= "rubeshkumar";
    			
    	System.out.println(s1.length());
    	
    	System.out.println(s1.charAt(0));
    	
    	for (int i=0;i<s1.length();i++)
    	{
    		System.out.print(s1.charAt(i));
    	}
    }
    
    
    
}