package Three;

import java.util.Scanner;

public class BasamakSayısıToplama {

	public static void main(String[] args) {

		
		//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

int number, tempNumber, total=0;
		Scanner input = new Scanner (System.in);
		System.out.print("Basamaklarını toplamak istediğiniz sayıyı giriniz: ");
		number=input.nextInt();
		
		
		tempNumber=number;
		while(tempNumber!=0) {
			total+=tempNumber%10;
			tempNumber/=10;

		}
		System.out.println("Basamak sayısı toplamı: " + total);
	}

}
