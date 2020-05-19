/* Program caculate the areas & perimeters of the excircle and the incircle of a given rectangle 	
	
Author: Yoaz Shmider	
	*/
	
	
import java.util.Scanner;

public class Circle
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program calculates the areas " +
         "and the perimeters of the excircle and the incircle " +
         "of a given rectangle ");
        
        //Receiving (x,y) coordinates of LeftUpperCorner 
        System.out.println("Please enter the two coordinates of the left-upper point of the rectangle"); 
        int leftUpX = scan.nextInt();
		int leftUpY = scan.nextInt();
		
		//Receiving (x,y) coordinates of RightBottomCorner
		System.out.println("Please enter the two coordinates of the right-bottom point of the rectangle"); 
        int rightBotX = scan.nextInt();
		int rightBotY = scan.nextInt();
		
		//Processing exCircle and inCircle radius
		double inCircleRadius = (leftUpY - rightBotY)/2.0;
		double a = Math.pow(inCircleRadius,2);
		double b = Math.pow((rightBotX - leftUpX),2);
		double exCircleRadius = Math.sqrt((a + b)); //Pitagoras
		
		//Processing exCircle & inCircle area
		double inCircleArea = (inCircleRadius * inCircleRadius) * Math.PI;
		double exCircleArea = (exCircleRadius * exCircleRadius) * Math.PI;
		
		//Processing exCircle & inCircle Perimeters
		double inCirclePerimeter = 2 * inCircleRadius * Math.PI;
		double exCirclePerimeter = 2 * exCircleRadius * Math.PI;
		
		System.out.println("Incircle: radius = " + inCircleRadius + ", area = " + inCircleArea + ", perimeter = " + inCirclePerimeter);
		System.out.println("Excircle: radius = " + exCircleRadius + ", area = " + exCircleArea + ", perimeter = " + exCirclePerimeter);
		
		
		
	}
	
	
}