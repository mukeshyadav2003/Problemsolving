package problems;

import java.util.Arrays;
import java.util.List;

public class Countwords {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("mukesh","dheena","Monish","vichu");
				

		  long counting = list
				  .stream()
				  .filter(a ->  a.length() > 5)
				  .count();
				  
		  System.out.println(counting);
	}

}
