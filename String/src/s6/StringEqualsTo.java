package s6;


public class StringEqualsTo {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		String s3= new String("java");
		
		if(s1==s2)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
		
		
		if(s1==s3)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
	}

}
