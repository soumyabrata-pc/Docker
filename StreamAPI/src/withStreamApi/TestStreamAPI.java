package withStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamAPI {
 
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int i=0;i<100; i++ ) {
			l1.add(i);
		}
		System.out.println(l1);
		
		List<Integer> l2= l1.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		
	}//main
}
