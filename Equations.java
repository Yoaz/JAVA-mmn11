/* This program solves a system of 2 linear equations Enter the coefficients a11 a12 a21 a22 b1 b2
	
   Author: Yoaz Shmider
	*/
	
import java.util.Scanner;

public class Equations
{
	public static void main (String [] args)
	{
	
	Scanner scan = new Scanner(System.in);
	double solPt1;
	double solPt2;
	
	System.out.println("This program solves a system of 2 linear equations");
	System.out.println("Enter the coefficients a11 a12 a21 a22 b1 b2:");
	
	//Recieving values from user
	int a11 = scan.nextInt();
	int a12 = scan.nextInt();
	int a21 = scan.nextInt();
	int a22 = scan.nextInt();
	int b1 = scan.nextInt();
	int b2 = scan.nextInt();
	
	System.out.println("Eq1: " + a11 + "*x1+" + a12 + "*x2=" + b1);
	System.out.println("Eq2: " + a21 + "*x1+" + a22 + "*x2=" + b2);
	
	//Proccessing solution based on Kremer Method
	// Case 1: Single solution
	if(((a11 * a22) - (a12 * a21)) != 0)
	{
		solPt1 = (double)((b1 * a22) - (b2 * a12)) / ((a11 * a22) - (a12 * a21));
		solPt2 = (double)((b2 * a11) - (b1 * a21)) / ((a11 * a22) - (a12 * a21));   
		System.out.println("Single solution: (" + solPt1 + "," + solPt2 +")");
	}
	
	// Case 2: Many Solution
	else if((((b2 * a11) - (b1 * a21)) == 0) && ((b1 * a22) - (b2 * a12) == 0))
	{
		if(!(a11 == 0 && a12 == 0 && a21 == 0 && a22 == 0 && b1 != 0 && b2 != 0))
			System.out.println("Many solutions");
	// Case 3: No Solution
		else
			System.out.println("No solution");
					
	}
		
			
	}
	
}