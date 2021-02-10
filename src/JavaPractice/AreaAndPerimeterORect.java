package JavaPractice;

public class AreaAndPerimeterORect {

	public static void main(String[] args) {
		
	//Length and breadth of a rectangle are 5 and 7 respectively. Write a program to 
		//calculate the area and perimeter of the rectangle.
		 Areaofrectangle(5,7);
		
	//Area of Rectangle formula	
		//int a=5;//length
		//int b=6; //width
		
		 perimeterOfrectangle(5,7);
		 
		 perimeterOfTriangle(2,3,5);
		
		
	}
	public static void Areaofrectangle(int a, int b) {
		// area of rectangle formula = l+w
		int areaofrectangle = a+b;
		System.out.println("areaofrectangle:"+areaofrectangle);
		
		
	}
	
	public static void perimeterOfrectangle(int a,int b) {
		
//		perimeter of rectangle	int Rectangle = 2*(length+width);
		
			int rectangleperimeter =2*(a+b);
			
			System.out.println("perimeter of rectangle:"+rectangleperimeter);
			
		
	}
//Write a program to calculate the perimeter of a 
//triangle having sides of length 2,3 and 5 units.	
	
	public static void perimeterOfTriangle(int l1,int l2, int l3) {
		//int perimeterOfTriangle = length+length+length
		
		int perimeterOfTriangle = l1+l2+l3;
		System.out.println("perimeterOfTriangle:"+perimeterOfTriangle);
		
	}
		

	

}
