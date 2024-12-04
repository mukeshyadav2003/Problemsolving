package Solution;

public class PrimeNumber {
	
	   boolean result=true;
	      PrimeNumber(int num){
	    	  
	    	    for(int i=2;i<num;i++ ) {
	    	    	
	    	    	if(num % i == 0) {
	    	    			
	    	    		result=false;
	    	    		break;
	    	    		
	    	    	}	    	    	
	    	    	
	    	    }
	    	    
	    	    if(result)  System.out.println(num +  " is Prime ");
	    	    
	    	    else System.out.println(num +  " is not Prime ");
	    	  
	      }
	

	public static void main(String[] args) {
		
		
		PrimeNumber p = new PrimeNumber(17);

	}

}
