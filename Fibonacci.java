package Three;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int n1=0,n2=1,total;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Eleman sayısını giriniz: ");
		int number=input.nextInt();
		
		while(number>1) {
			total=n1+n2;
			System.out.println(n1 + " + " + n2 + " = " + total);
			n1=n2;
			n2=total;
			number--;
		}
	}

}
