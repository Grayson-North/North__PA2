package north_p1;
import java.util.Scanner;
public class decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String digit;
		int n, n1, n2 ,n3;
		int hold;
		
		System.out.println("Please enter a four digit number to decrypt it.");
		digit = scnr.next();
		
		n = Character.getNumericValue(digit.charAt(0));
		n1 = Character.getNumericValue(digit.charAt(1));
		n2 = Character.getNumericValue(digit.charAt(2));
		n3 = Character.getNumericValue(digit.charAt(3));
		
		if ((n <= 6) && (n >= 0))
		{
			n = n + 10;
			n = n - 7;
		}
		else if ((n > 6) && (n <= 9))
		{
			n = n - 7;
		}
		
		if ((n1 <= 6) && (n1 >= 0))
		{
			n1 = n1 + 10;
			n1 = n1 - 7;
		}
		else if ((n1 > 6) && (n1 <= 9))
		{
			n1 = n1 - 7;
		}
		
		if ((n2 <= 6) && (n2 >= 0))
		{
			n2 = n2 + 10;
			n2 = n2 - 7;
		}
		else if ((n2 > 6) && (n2 <= 9))
		{
			n2 = n2 - 7;
		}
		
		if ((n3 <= 6) && (n3 >= 0))
		{
			n3 = n3 + 10;
			n3 = n3 - 7;
		}
		else if ((n3 > 6) && (n3 <= 9))
		{
			n3 = n3 - 7;
		}
		
		hold = n2;
		n2 = n;
		n = hold;
		
		hold = n3;
		n3 = n1;
		n1 = hold;
		
		System.out.printf("%d%d%d%d\n", n, n1, n2, n3);
	}

}