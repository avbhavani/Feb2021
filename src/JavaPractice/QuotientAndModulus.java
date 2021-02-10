package JavaPractice;

public class QuotientAndModulus {

	public static void main(String[] args) {
		
		modulusandQuetient();
//
	}	
public static  void modulusandQuetient() {	
		
		//Write a program to add 
		//8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
		
		int a = 2345;
		int b = 2345+8;
		
		int divide = b/3;
		int result =0;
		
		System.out.println(b);
		System.out.println("divide value:"+divide);
		
		System.out.println("after modulus:"+divide%5);
		result = divide%5;  //4
		int finalresult = result *5;
		
		System.out.println(finalresult);
		
		System.out.println((((8+2345)/3)%5)*5);
		
		System.out.println(23==45);
	}



}
