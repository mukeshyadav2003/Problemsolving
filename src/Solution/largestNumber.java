package Solution;

public class largestNumber {

	
	    public  largestNumber() {
	    	
	    	int arr[]= {1,8,3,4,5};
	    	
	    	int largest=0;
	    	
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		
	    		if(largest<arr[i]) {
	    			
	    			largest=arr[i];
	    		}
	    		
	    		
	    	}
	    	
	    	System.out.println(largest);
	    }
	
	
	public static void main(String args[]) {
		
		largestNumber ans = new largestNumber();
		
	}
}
