 import java.util.function.Predicate;

public class RetrivingTheData {
     public static void main(String[] args) {
		String nickName[]= {"Soumya","Sunil","Soumya","Rinku","Chiku"};
		
		//write lamda function
	  Predicate<String> p = name -> name.charAt(3)=='i';
	  
	  //using for each loop retrive the data
	  for(String name : nickName) {
		  if(p.test(name)) {
			  System.out.println(name);
		  }
		  
	  }
	}
}
