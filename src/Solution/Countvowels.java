package Solution;

public class Countvowels {

	   public Countvowels() {
		   
		   String str = "mukesh";
		   
		   for(int i=0;i<str.length();i++) {
			   
			   char ch =str.charAt(i);
			   
			   if(ch == 'a' || ch == 'e'||ch == 'i'|| ch == 'o'|| ch == 'u') {
				   
				   System.out.println(ch);
				   
			   }
			   else {
				   continue;
			   }
		   }
		   
	   }
	
	
	public static void main(String[] args) {
   
		 Countvowels cc = new  Countvowels();
	}

}
