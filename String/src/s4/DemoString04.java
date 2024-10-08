package s4;

public class DemoString04 {
	public static void main(String[] args) {
		String str="a1b2c3";
		
		StringBuilder charstring =new StringBuilder(); //to collect chareacter charecter
		StringBuilder numericstring = new StringBuilder(); //to collect numeric charecter
		int sum =0;
	
		for(int i=0;i<str.length();i++) {
			char currentChar = str.charAt(i);
			
			if(Character.isDigit(currentChar)) {
				numericstring.append(currentChar);
				sum +=Character.getNumericValue(currentChar);//add digit to sum
			}else if(Character.isLetter(currentChar)) {
				charstring.append(currentChar);//append letter to charString
			}//else
			
		}
		// Print results
        System.out.println("Character String: " + charstring.toString());
        System.out.println("Numeric String: " + numericstring.toString());
        System.out.println("Sum of Numbers: " + sum);
		
	}//main
}//class


