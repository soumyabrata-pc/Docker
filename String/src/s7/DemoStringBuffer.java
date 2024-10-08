package s7;

public class DemoStringBuffer {

	public static void main(String[]args) {
		StringBuffer sb=new StringBuffer();
		
		System.out.println("default capacity ="+sb.capacity());
		System.out.println("length = "+sb.length());
		
		System.out.println("===append()===");
		
		sb.append("java");
		sb.append("program");
		System.out.println("sb = "+sb);
		System.out.println("default capacity ="+sb.capacity());
		System.out.println("length = "+sb.length());
		
		System.out.println("========insert()=========");
		sb.insert(4, "-Laguage-");
		System.out.println("sb = "+sb);
		System.out.println("default capacity ="+sb.capacity());
		System.out.println("length = "+sb.length());
		
		System.out.println("========trimToSize()==========");
		sb.trimToSize();
		System.out.println("sb = "+sb);
		System.out.println("default capacity ="+sb.capacity());
		System.out.println("length = "+sb.length());
		
		
		System.out.println("=====reverse()=====");
		System.out.println("reverse="+sb.reverse());
		
	}
}
