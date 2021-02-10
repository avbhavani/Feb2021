package JavaPractice;

public class SwappingNums {
	
	//Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively,
	//write two programs to swap the values of the two variables.
public static void main(String[] args) {
	
	thirdvariable();
	withoutthirdvariable();
	
}
	
public static void withoutthirdvariable() {
	int a =6;
	int b =8;
	
	System.out.println("a before swaping: "+a);
	System.out.println("b before swaping:"+b);
	a= a+b;
	//System.out.println(a);
	b=a-b;
	a=a-b;
	System.out.println("a val after swaping: "+a);
	System.out.println("b value after swaping:"+b);
	
	
	//using third variable
	
}

public static void thirdvariable() {
	int a =6;
	int b =8;
	int c=b;
	b=a;
	a=c;
	

	System.out.println("a val after swaping using third varibale"+a);
	System.out.println("b val after swaping using third varibale"+b);
	
	
	
	
}
	
}
