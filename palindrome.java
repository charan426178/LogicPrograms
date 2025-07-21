package program;

public class palindrome {
	static boolean pal(int n, int m, int rev) {
		if (n == 0)
			return rev == m;
		rev = rev * 10 + n % 10;
		return pal(n/10, m, rev);
	}
	
	public static void main(String[] args) {
		System.out.println(pal(123, 123, 0));
	}
}
