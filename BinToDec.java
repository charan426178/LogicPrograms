package program;

public class BinToDec {
	static int binToDec(int n, int sum, int p) {
		if (n == 0)
			return sum;
		sum = sum+ (p * n % 10);
		return binToDec(n / 10, sum, p * 2);
	}

	public static void main(String[] args) {
			System.out.println(binToDec(1011, 0, 1));
	}	
}
