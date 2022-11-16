package Three;

import java.util.Scanner;

public class DiamondWithStars {

	public static void main(String[] args) {
		/*
		 * 
    *          9 satır 4 boşluk 1 yıldız
   ***                 3 boşluk 3 yıldız
  *****                2 boşluk 5 yıldız
 *******               1 boşluk 7 yıldız 
*********              0 boşluk 9 yıldız
 *******               1 boşluk 7 yıldız 
  *****                2 boşluk 5 yıldız
   ***                 3 boşluk 3 yıldız
    *                  4 boşluk 1 yıldız
		 */

		int k; //k=5
		Scanner input = new Scanner (System.in);
		System.out.print("Satır sayısını giriniz: ");
		k=input.nextInt();
		
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=(k-i);j++) {
				System.out.print(" ");
			}
			for(int m=1;m<=(2*i)-1;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=k-1;i>0;i--) {
			for(int j=1;j<=k-i;j++) {
				System.out.print(" ");
			}
			for(int m=1;m<=(2*i)-1;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
