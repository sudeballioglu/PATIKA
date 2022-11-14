package Three;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
		 * 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
		 */
		
		
		int k,total=0,average,divisor=0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Give me a number: ");
		k=input.nextInt();
		
		for(int i=1;i<=k;i++) {
			if((i%3==0)&&(i%4==0)) {
				total+=i;
				divisor++;
			}
		}
		average=total/divisor;
		System.out.print("Average: " + average);
		
	
	}

}
