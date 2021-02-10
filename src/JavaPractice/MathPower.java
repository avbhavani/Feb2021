package JavaPractice;

public class MathPower {

	public static void main(String[] args) {
		powerOfSeven();
	}

	
	public static void powerOfSeven() {
		
		int a = 7;
		
		
		//int power = (int) Math.pow(7, 5); //typecast downcasting

		
		double  power = Math.pow(7, 5);
		
		System.out.println("power of 7 raised 5:"+power);
		
		System.out.println(Math.pow(7,5));
		
	}
}
