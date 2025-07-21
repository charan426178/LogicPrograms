package program;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice\n1.Prime Number\n2.Prfect Number\n3.Sum of Digits\n"
				+ "4.Automorphic Number\n5.Strong Number\n6.Armstrong Number,7.Binary To Decimal\n8.Decimal To Binary"
				+ "9.Neon Number\n10.Lcm");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			//prime
			System.out.println("Choose your choice\n1.prime or Not\n2.largest prime"
					+ "\n3.alternate prime\n4.range");
			int num1 = sc.nextInt();
			switch(num1) {
			case 1:
				System.out.println("enter your number:");
				int n1 = sc.nextInt();
				if(checkPrime1.prime(n1, n1/2))
					System.out.println("prime");
				else
					System.out.println("not prime");
				break;
			case 2:
				System.out.println("enter your rane:");
				int n2 = sc.nextInt();
				largePrime.large(n2);
				break;
			case 3:
				System.out.println("enter your range:");
				int n3 = sc.nextInt();
				largePrime.large(1,n3,0);
				break;
			case 4:
				System.out.println("enter your start range:");
				int st = sc.nextInt();
				System.out.println("enter your end range:");
				int last = sc.nextInt();
				range1.primeRange(st, last);
				break;
			default:
				System.out.println("invalid choice");
				
				
			}
		case 2:
			//perfect
		case 3:
			//sum of digits
		case 4:
			//automorphic
		case 5:
			//strong Number
		case 6:
			//Armstrong
		case 7:
			//Binary to decimal
		case 8:
			//decimal to binary
		case 9:
			//neon
		case 10:
			//break
		default:
			
		}
		
	}

}
