package JavaPractice;

public class SumOfFirstAndlastDigit {

	public static void main(String[] args) {
	
		//Write a //program to calculate the sum of the first and the second last digit of a 5 digit.	
		int number =12345 ;
		 
		    int last = number % 10;
		    int first = number;
		    
		    while (first >= 10) {
		        first = first / 10;
		    }

		    System.out.println( first + last);
		}

	}


