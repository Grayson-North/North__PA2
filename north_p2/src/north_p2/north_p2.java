package north_p2;
import java.util.Scanner;
public class north_p2 {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		double weight;
		double height;
		String measure;
		double BMI;
		
		System.out.println("Are your measurements in metric, or in imperial units (ft, lbs"));
		measure = scnr.next();
		
		if (measure.compareTo("metric") == 0)
		{
			System.out.println("Please enter your weight in kilograms.");
			weight = scnr.nextInt();
			System.out.println("Please enter your height in meters.");
			height = scnr.nextInt();
			
			BMI = weight / (Math.pow(height, 2));
			System.out.printf("Your BMI is: %f.2\n", BMI);
			
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater");
		}
			
		else if (measure.compareTo("imperial") == 0)
		{
			System.out.println("Please enter your weight in pounds.");
			weight = scnr.nextInt();
			System.out.println("Please enter your height in inches.");
			height = scnr.nextInt();
			
			BMI = (703 * weight) / (Math.pow(inches, 2));
			System.out.printf("Your BMI is: %f.2\n", BMI);
			
			System.out.println("BMI Categories:\r\n" + 
					"Underweight = <18.5\r\n" + 
					"Normal weight = 18.5–24.9\r\n" + 
					"Overweight = 25–29.9\r\n" + 
					"Obesity = BMI of 30 or greater");
		}
		
		else
		{
			System.out.println("invalid input");
			
		}
		
	}

}
