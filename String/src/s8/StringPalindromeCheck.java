package s8;

import java.util.Scanner;

public class StringPalindromeCheck {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		System.out.println("Enter the String");
		String str= s.nextLine();
		str= str.trim();
		
		sb=sb.append(str);
		StringBuffer revstr=sb.reverse();
		
		String revstr1= revstr.toString();
		System.out.println("print Reverse :"+revstr1);
		
		
		if(str.equals(revstr1)) {
			System.out.println("strings are palindrome");
		}else
			System.out.println("Strings are not palindrome");
		
		s.close();
		
	}

}
