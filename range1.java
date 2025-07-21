package program;

public class range1 {
		public static void primeRange(int st,int end) {
			if(st > end) return;
			if(checkPrime1.prime(st,st/2)) {
				System.out.println(st);
			}
			primeRange(st+1,end);
		}
		
}
