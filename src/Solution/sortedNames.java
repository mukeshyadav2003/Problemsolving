package problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortedNames {

	public static void main(String[] args) {
	
		
		List<String> list = Arrays.asList("vichu","dheena","monish","mukesh");

		
		
		
		 List<String> set=list.stream()
		.sorted()
		.collect(Collectors.toList());
		 
		 
		 
		  System.out.println(set);
	}

}
