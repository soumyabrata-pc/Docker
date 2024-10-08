package s1;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] Args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		String s1 = s.nextLine();
		//string literal method
		String s2= "Rashmi";
		//Using new Operator
		String s3 = new String("Soumya");
		char ch[]= {'l','a','n','g','u','a','g','e'};
		String s4=String.valueOf(ch);//static factory method
		String s5=s2.concat(s4);   //Instance-Fatory method
		String s6=s1+s2+s3+s4;
		
		String s7=s1.concat(String.valueOf(ch));
		
		//sop
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		System.out.println("s4 = "+s4);
		System.out.println("s5 = "+s5);
		System.out.println("s6 = "+s6);
		System.out.println("s7 = "+s7);
		
		//find length
		System.out.println("length of s7 = "+s7.length());
		//Character at index point
		System.out.println("char at index 6" +s7.charAt(6));
		//replace 'a' with 'z'
		System.out.println("replace with 'z',where find 'a' result:: "+s6.replace('a', 'z'));
		//substring
		System.out.println("subString : "+s6.substring(4, 16) );

		s.close();
	}
}
