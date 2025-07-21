package program;

class largePrime {
	public static void large(int st,int last, int count) {
		if(st>=last) return;
		if(checkPrime1.prime(st, st/2)) {
			count++;
			if(count%2!=0)
				System.out.println(st);
		}
		large(st+1,last,count);
	}
	
	public static void large(int last) {
		if(last==0) return;
		if(checkPrime1.prime(last, last/2)) {
			System.out.println(last);
			return;
		}
		large(last-1);
		
	}

}
