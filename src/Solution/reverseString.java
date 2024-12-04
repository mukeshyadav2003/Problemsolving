package Solution;

import java.util.Scanner;

public class reverseString {

	 public static void Reverse(String str) {
		 
		      String reverse="";
		 
		    for(int i=str.length()-1;i>=0;i--) {
		    	
		           reverse  +=  str.charAt(i);
		        		    	
		    }
		       
		    System.out.println(reverse);
	 }
	
	 
	 public static void main(String args[]) {
		 
		 Scanner scan = new Scanner(System.in);
		 String ans = scan.next();
		 
		 reverseString.Reverse(ans);
		 
	 }
}
