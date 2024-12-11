package solution;

public class Factorial_number {
	
	int ans=1;
	
	public int Factorial(int inp){
		
		
		for(int i=1;i<=inp;i++) {
			
		     int temp =ans*i;
		      ans=temp;
			
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
	
		Factorial_number ff = new Factorial_number();
		
		System.out.println(ff.Factorial(5));
	}

}
