
package program;

public class digit {
	public static int dgt(int n, int sum) {
		
		if(n==0) {
			if(sum<=9) return sum;
			return dgt(sum,0);
		}
		sum+=n%10;
		return dgt(n/10,sum);
	}
	public static void main(String[] args) {
		System.out.println(dgt(193,0));
	}

}
