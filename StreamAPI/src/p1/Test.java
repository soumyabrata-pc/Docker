package p1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<=10; i++) {
			l1.add(i);
		}
		System.out.println(l1);

		ArrayList<Integer> l2=new ArrayList<Integer>();
		for(int i:l1) {
			if(i%2==0) {
				l2.add(i);
			}
		}
		System.out.println(l2);
	}

}
