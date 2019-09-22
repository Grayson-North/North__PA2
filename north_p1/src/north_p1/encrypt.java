package north_p1;
import java.util.Scanner;

public class encrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String digit;
		int n, n1, n2 ,n3;
		int hold;
		
		System.out.println("Please enter a four digit number to be encrypted: ");
		digit = scnr.next();
		
		n = Character.getNumericValue(digit.charAt(0));
		n = n + 7;
		n = n % 10;
		
		n1 = Character.getNumericValue(digit.charAt(1));
		n1 = n1 + 7;
		n1 = n1 % 10;
		
		n2 = Character.getNumericValue(digit.charAt(2));;
		n2 = n2 + 7;
		n2 = n2 % 10;
		
		n3 = Character.getNumericValue(digit.charAt(3));;
		n3 = n3 + 7;
		n3 = n3 % 10;
		
		hold = n2;
		n2 = n;
		n = hold;
		
		hold = n3;
		n3 = n1;
		n1 = hold;
		
		System.out.printf("%d%d%d%d\n", n, n1, n2, n3); 
	}
}
