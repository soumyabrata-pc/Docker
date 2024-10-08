package mapAndCollect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l1=new ArrayList<String>();
		l1.add("soumya");
		l1.add("rashmi");
		l1.add("brata");
		l1.add("rekha");
		l1.add("das");
		l1.add("choudhury");
		System.out.println(l1);
		
		
		List<String>l2=l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		//Map() and collect()
		long count=l1.stream().filter(s->s.length()==5).count();
		System.out.println("the no of 5 length is:"+count);
		
		//short()
		List<String> l3=l1.stream().sorted().collect(Collectors.toList());
		System.out.println("according to default natural sorting order :"+l3);
		
		List<String> l4=l1.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("according to customized sorting order:"+l4);
		
		//min() && max()
		
		String min=l1.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("minimum value is:"+min);
		
		String max=l1.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("minimum value is:"+max);
		
		
		//forEach....
		l3.stream().forEach(i->System.out.println(i));
		System.out.println("====================================================================");
		l3.stream().forEach(System.out::println);
		
		System.out.println("====================================================================");
		
		//toArray()
		String[] ir=l2.stream().toArray(String[]::new);
		for(String i: ir) {
			System.out.println(i);
		}
		
		System.out.println("====================================================================");
		
		//Stream.of() method
		
		
		Stream<Integer> s=Stream.of(99,999,9999,99999,999999,9999999);
		s.forEach(System.out::println);
		
		System.out.println("====================================================================");
		
		Integer[] numbers = {1, 2, 3, 4, 5};
		Stream<Integer> numberStream = Stream.of(numbers);
		numberStream.forEach(System.out::println);  // Output: 1 2 3 4 5
		
		System.out.println("====================================================================");

		
		Double[] d= {10.0,10.1,10.2,10.3,10.4};
		Stream<Double> s1=Stream.of(d);
		s1.forEach(System.out::println);
	}
	
}
