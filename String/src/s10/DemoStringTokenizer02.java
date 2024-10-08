package s10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DemoStringTokenizer02 {

	public static void main(String[] args) {

		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		
		StringTokenizer st=new StringTokenizer(str," ");
		
		System.out.println("==========displayTokens==========");
		while(st.hasMoreTokens()){
			//System.out.println(st.nextToken());
			String s1=st.nextToken();
			StringBuffer sb= new StringBuffer(s1);
			System.out.println(sb.reverse());
			
		}
		s.close();
	}

}

