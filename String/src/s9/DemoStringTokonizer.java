package s9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DemoStringTokonizer {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		
		StringTokenizer st=new StringTokenizer(str,"u");
		
		System.out.println("==========displayTokens==========");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		s.close();
		
	}

}
