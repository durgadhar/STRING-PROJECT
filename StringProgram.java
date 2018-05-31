/* Q. 1) Design and develop a program in java which will have the following string outputs.
	(a). Return the no of occurances of a particular character in the String.
	(b). Capitalized the alternative character of a String. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StringProgram
{
	    public void characterCount(String s)
	    {
		char c;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the character you want to count:");
		c=sc.next().charAt(0);
		n=0;
			for(int i=0;i<s.length();i++)
	     		if(c==s.charAt(i))
		        n++;
			System.out.println("\nThe character '"+c+"' has occured "+n+" times in "+s);
	    }
		    public String capitalize(String s)
		    {
			char[] c;
			String s1;
			c=s.toCharArray();
				for(int i=1;i<c.length;i=i+2)
				    c[i]=Character.toLowerCase(c[i]);
				for(int i=0;i<c.length;i=i+2)
				    c[i]=Character.toUpperCase(c[i]);
			s=String.valueOf(c);
			return s;
		    }
    public static void main(String args[]) throws IOException
	    {
		StringProgram sp = new StringProgram();
		String s;
		int n;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the string: ");
		s=b.readLine();
		sp.characterCount(s);
		System.out.println("\nThe capitalized string is: "+sp.capitalize(s));
	    }
}
