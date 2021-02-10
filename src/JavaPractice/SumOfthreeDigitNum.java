package JavaPractice;

public class SumOfthreeDigitNum {
	
//Write a program to calculate the sum of the digits of a 3-digit number.
//Number : 132        Output : 6
	public static void main(String[] args) {
		
int number = 132;

int sum=0;

while(number>0) {
	int remainder = number%10;
	sum = sum+remainder; //0+2=2 //2+3=5//5+1=6//
	number = number/10; 
	}
System.out.println("sum of digits 132 is = "+sum);
}
}