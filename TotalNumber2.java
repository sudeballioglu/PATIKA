package Three;

import java.util.Scanner;

public class TotalNumber2 {

	public static void main(String[] args) {
		
		/*
		 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
		 *  girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları
		 *   olan sayıları toplayıp ekrana basan programı yazıyoruz.
		 */
		
		
		int k,total=0;
		
		Scanner input =new Scanner(System.in);
		
		do {
			System.out.print("Enter a number: ");
			k=input.nextInt();
			if((k%4==00)) {
				total+=k;
			}
		}while(k%2==0);
		
		System.out.print("Total: " + total);

	}

}
