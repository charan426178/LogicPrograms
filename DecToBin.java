package program;

public class DecToBin {
	public static int decToBin(int n, int sum, int p) {
		if (n == 0)
			return sum;
		int last = n % 2;
		sum += last * p;
		return decToBin(n / 2, sum, p * 10);
	}
	public static void main(String[] args) {
		System.out.println(decToBin(12,0,1));
	}

}
