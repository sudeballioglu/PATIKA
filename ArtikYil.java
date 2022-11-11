package Two;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		
		int year;
		boolean isError=false;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Yıl giriniz: ");
		year=input.nextInt();
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					isError=false;
					
				}else {
					isError=true;
				}
				
			}else {
				isError=false;
			}
			
		}else {
			isError=true;
		}
		
		if(isError) {
			System.out.println(year + " bir artık yıl değildir.");
		}else {
			System.out.println(year + " bir artık yıldır.");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
