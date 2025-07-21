package program;

public class GCD {
	

	public static int gcd(int n, int m, int i, int gcd) {
		if(i==m/2) return gcd;
		if(n%i==0 && m%i==0) 
			gcd = i;
		return gcd(n, m, i+1, gcd);
		
		
	}
	public static void main(String[] args) {
		System.out.println(gcd(15, 12, 1, 1));
		int lcm = 15*12/gcd(15, 12, 1, 1);
		System.out.println(lcm);
	}

}
