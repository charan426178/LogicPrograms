package program;



public class auto {
	public static boolean autoMorphic(int n, int m) {
		if (n == 0)
			return true;
		if (n % 10 != m % 10)
			return false;
		return autoMorphic(n / 10, m / 10);
	}
	public static void autoRange(int n) {
		if(n==0) return ; 
		if(autoMorphic(n, n*n)) {
			System.out.println(n);
		}
		autoRange(n-1);
	} 
	
	public static void main(String[] args) {
		autoRange(100);
	}
}
