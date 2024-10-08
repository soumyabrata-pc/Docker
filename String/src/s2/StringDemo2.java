package s2;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {

		
	Scanner s =new Scanner(System.in);
	System.out.println("Enter Data");
	String s1= s.nextLine();
	int count=0;
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
	
	System.out.println("The number of vowel :"+count);
	s.close();
	}
	
}
