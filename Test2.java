package program;

public class Test2 {
	static boolean spy(int n, int prod, int sum) {
		if(n==0) return prod == sum;
		sum= sum+n%10;
		prod = prod*n%10;
		return spy(n/10, prod, sum);
	}
	static void range(int st, int end, int count) {
		if(end<st) return;
		if(spy(end,1,0)) {
				System.out.println(end);
				return;
		}
		range(st, end-1, count);
	}
	public static void main(String[] args) {
		range(1, 500, 0);
	}

}
