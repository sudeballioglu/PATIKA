package Three;

import java.util.Scanner;

public class ReverseTriangle {

	public static void main(String[] args) {

		/*
		                     
		               satır   boşluk  yıldız
 *******************    1        1      19
  *****************     2        2      17
   ***************      3        3      15
    *************       4        4      13
     ***********        5        5      11
      *********         6        6       9
       *******          7        7       7
        *****           8        8       5
         ***            9        9       3
          *            10        10      1
		               i         i       (2*(number-i))-1
		 
		 */
		
		
		
		Scanner input= new Scanner (System.in);
		System.out.print("Enter the line number: ");
		int number = input.nextInt();
		
		for(int i=0;i<number;i++) { 
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int m=(2*(number-i))-1;m>0;m--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
