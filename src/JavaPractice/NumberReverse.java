package JavaPractice;

public class NumberReverse {
	
	public static void main(String[] args) {
		
		firstway() ;
		secondway();
		
	}
	
public static void firstway() {
	int num=132;
	int reverse=0;
while(num>0) {
	
	int remainder = num%10;
	reverse = reverse*10+remainder;
	 num = num/10;
			
}
System.out.println("reverse of 132 ="+reverse);
}

public static void secondway() {
	int num=1624268;
	System.out.println("rveverse of num in second way");
while(num>0) {
	
	int remainder = num%10;
	
	num= num/10;
	System.out.print(remainder); 
			
}

}

}


		
	

