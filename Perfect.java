package program;

public class Perfect {
	public static boolean perfect(int n, int i, int sum) {
		if(i>n/2) return sum==n;
		if(n%i==0) 
			sum+=i;
		return perfect(n,i+1,sum);
	}
	public static void main(String[] args) {
		int n= 6;
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
