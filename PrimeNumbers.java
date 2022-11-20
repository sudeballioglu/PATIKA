package Four;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static boolean Isprime(int number,int i) {
		
		if(i==number) {
			System.out.println(number + " is a prime number.");
			return true;
		}else if(number%i==0) {
			System.out.println(number + " is not a prime number.");
			return false;
		}
		
		return Isprime(number,i+1);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int number=scan.nextInt();
		Isprime(number,2);
	}

}
