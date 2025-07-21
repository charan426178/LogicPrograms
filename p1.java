package program;

public class p1 {
	public static void main(String[] args) {
		int n = 5;
		int star = 1;
		int spaces = n-1;
			
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= star; j++) {
				if(j%2 != 0)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			spaces--;
			star+=2;
		}
	}

}
