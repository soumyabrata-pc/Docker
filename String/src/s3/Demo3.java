package s3;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Data here");
		String s1= s.nextLine();
		
		//length
		System.out.println("length of string : "+s1.length());
		//no of vowels
		int count=0;
		int sum=0;
		int num=0;
		for(int i=0;i<s1.length();i++) {
			switch(s1.charAt(i)) {
			
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++;
				break;
			}//switch
		}
		System.out.println("no of vowel: "+count);
		
		//no of consonents
		
		System.out.println("no of consonent : "+(s1.length()-count));
		
		//no of lines (fail)
		
		
		//*sum of numerics*
		
		
		// Iterate over each character in the string
		for(int i=0;i<s1.length();i++) {
			
			char ch = s1.charAt(i);
			// Check if the character is a digit
			if(Character.isDigit(ch)) {
		    num = Character.getNumericValue(ch);
			
			}
			sum=sum+num;
		}//for
		System.out.println("sum of numeric= "+sum);
		s.close();
		
	}

	

}
