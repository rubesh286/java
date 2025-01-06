package string;

import java.util.Arrays;

public class frequency_of_substring {

	public static void main(String[] args) {
 


 String s1="HI I AM CHITI SPEED 1 TERABITE MEMORY 1 GIGABITE";
		
		String substring="1";
		
		String[]sa=s1.split(" ");
		
		int count=0;
		
		System.out.println(Arrays.toString(sa)); //[HI, I, AM, CHITI, SPEED, 1, TERABITE, MEMORY, 1, GIGABITE]
		
		System.out.println(sa.length); //10
		
		for(int i=0;i<sa.length;i++)  // 0  ; 0<10
		{
			if(sa[i].equalsIgnoreCase(substring))  // HI equals chiti
			{
				count++;
			}
			
		}
		
		System.out.println("Frequency of sub string is:"+count); 
		
	}
}

// for my understanding this is checking how many repetations in the string[] 
