package JavaPractice;

public class CalculatingPercentage {

	public static void main(String[] args) {
		
		int math= 70;
		int sceince= 60;
		int spanish =50;
		
		float sum = math+sceince+spanish;
		float average = sum/3;
		float percentage = (sum/300)*100; //300 bz each  subject out of 100
		
		System.out.println("average of marks ="+average);
		System.out.println("percenatge of marks="+percentage+"%");

	}

}
