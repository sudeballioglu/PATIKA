package Three;

import java.util.Scanner;

public class PowerOf4and5 {

	public static void main(String[] args) {
		
		int k;
		Scanner scn = new Scanner (System.in);
		
		System.out.print("Üst sayı sınırını giriniz: ");
		k=scn.nextInt();
		
		System.out.println("Powers of 4: ");
		for(int i=1;i<=k;i*=4) {
			System.out.println(i);
		}
		
		System.out.println("Powers of 5: ");
		for(int m=1;m<=k;m*=5) {
			System.out.println(m);
		}
		
	}

}
