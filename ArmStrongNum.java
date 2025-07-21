package program;



public class ArmStrongNum {
	static int count(int n) {
		if (n == 0)
			return 0;
		return 1 + count(n / 10);
	}

	static int power(int b, int p) {
		if (p == 0)
			return 1;
		return b * power(b, p - 1);
	}

	static boolean armStrong(int n, int m, int sum, int digits) {
		if (n == 0)
			return sum == m;
		int digit = n % 10;
		sum += power(digit, digits);
		return armStrong(n / 10, m, sum, digits);

	}
	static void rangeArm(int st, int end) {
		if(st > end) return ;
		if(armStrong(st,st,0,count(st)))
			System.out.println(st);
		rangeArm(st+1, end);
	}

	public static void main(String[] args) {
			int n = 153;
			int digits = count(n);
//			System.out.println(armStrong(n, n, 0, digits));
			rangeArm(1, 500);
	}
}
