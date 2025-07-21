package program;

public class Neon {
	static boolean neon(int n, int m, int sum) {
		if (n==0) {
			return sum == m;
		}
		sum+=n%10;
		return neon(n/10, m, sum);
	}
	public static void autoRange(int st, int end) {
		if(st>=end) return ; 
		if(neon(st, st,0)) {
			System.out.println(st);
		}
		autoRange(st+1, end);
	} 
	public static void main(String[] args) {
		int n = 9;
		System.out.println(neon(n*n, n, 0));
	}

}
