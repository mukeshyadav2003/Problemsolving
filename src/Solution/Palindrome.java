package Solution;
import java.util.*;

public class Palindrome {


	
	    static public void Palidrom(String str) {
	    	 
	    	 
	    	
	    	String rev = new StringBuilder(str).reverse().toString();
	    	 
	    	if(str.equals(rev)) {
	    		
	    		System.out.println(str + "  Palindrom  ");
	    		
	    	}
	    	
	    	else {
	    		
	    		System.out.println( str + "  Not PAlidrom  ");
	    		
	    	}
	     }
	
	    public static void main(String args[]) {
			System.out.println("Enter Input :");
			Scanner scan = new Scanner(System.in);
			
			String str=scan.next();
			Palindrome.Palidrom(str);
			
		}
	
}
