package s5;

import java.util.Scanner;

public class StringComarission {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String s1= s.nextLine();
		s1=s1.trim();
		System.out.println("Enter the 2nd String");
		String s2= s.nextLine();
		s2=s2.trim();//use for remove space before and after the string.
		
		System.out.println("--------equals()----------");
		boolean k=s1.equals(s2);
		
		if(k)
			System.out.println("Strings are Equal");
		else
			System.out.println("Strings are not Equal");
		
		
		System.out.println("----------compareTo()------------");
		
		int z= s1.compareToIgnoreCase(s2);
		if(z==0)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not eual");
		
		s.close();
	}

}
