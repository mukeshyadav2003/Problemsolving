package Solution;

public class FibnociSerias {

	         
	public FibnociSerias() {
		
		  int n=10;
		  
		  int a=0;
		  int b=1;
		  
		  
		  for(int i=0;i<n;i++) {
			  
			  System.out.print(a + " ");
			  
			  int temp = a+b;
			  a=b;
			  b=temp;
			  
		  }
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		FibnociSerias ff = new FibnociSerias();
		
	}

}
