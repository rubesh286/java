package vote;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class voting {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		verification(age);
	}
	
	public static void verification(int age)
	{
		if (age<18)
		{
			try
			{
			throw new OutofAge();
		    }
			
			catch(OutofAge e) 
			{
				System.out.println("you'r not eligibel");
			}
		}
		
		else
		{
			try {
				throw new EligibelException();
			}
			catch(EligibelException e)
			{
				System.out.println("you'r eligibel for voting");
			}
		}
		
		 System.out.println("Thank you for visting our site");
		
	}

}
