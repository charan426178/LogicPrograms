package program;

public class Strong {
	public static boolean strongNum(int n, int m, int sum) {
		if(n==0) return sum==m;
		sum+=fact(n%10);
		return strongNum(n/10, m, sum);
		
	}
	public static int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		System.out.println(strongNum(145, 145, 0));
	}
}
