package program;

class checkPrime1 {
	public static boolean prime(int n, int i) {
		if(i==1) return true;
		if(n<=1|| n%i==0) return false;
		return prime(n,i-1);
		
	}

}
