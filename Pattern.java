package Four;

import java.util.Scanner;

public class Pattern {
	
	public static int pat(int n, int tempNumber, int x) {
		if(n>0 && x==0) {
			System.out.print(n + " ");
			n-=5;
			pat(n,tempNumber,0);
		}
		 else if (n==0 || n<0) {
	            System.out.print(n + " ");
	            n+= 5;
	            pat(n,tempNumber,1);
	        }
		 else if (n> 0 && n<= tempNumber && x == 1) {
	            System.out.print(n+ " ");
	            n+= 5;
	            pat(n,tempNumber, 1);
	        }
		return 0;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("N sayısı: ");
		int n = input.nextInt();
		pat(n,n,0);
}

}
