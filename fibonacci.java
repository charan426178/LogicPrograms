package program;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class fibonacci {
		static void fib(int a, int b, int range) {
			if(a>=range) return;
			System.out.println(a);
			fib(b,a+b,range-1);
			
		}
		public static void main(String[] args) {
			fib(0,1,50);
		}
}
