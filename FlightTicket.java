package Two;

import java.util.Scanner;

public class FlightTicket {
	
	public static void main(String[] args) {
		
		int age,travelType,distance;
		double totalCost=0;
		boolean isError;
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz: ");
		distance=input.nextInt();
		System.out.print("Yaşınızı giriniz: ");
		age=input.nextInt();
		System.out.print("Yolculuk tipini giriniz (1=TEK YÖN, 2=GİDİŞ-DÖNÜŞ): ");
		travelType=input.nextInt();
		
		if((distance<0)|| (age<0)) {
			isError=true;
			
		}else {
			switch (travelType) {
			case 1: {
				totalCost=(distance*0.10);
				if(age<12) {
					totalCost=(totalCost*0.5);
				}else if(age<24) {
					totalCost=(totalCost*0.9);
				}else if(age>65) {
					totalCost=(totalCost*0.7);
				}
				isError=false;
			}break;
			
			case 2:{
				totalCost=(distance*0.10)*2;
				if(age<12) {
					totalCost=(totalCost*0.5)*0.8;
				}else if(age<24) {
					totalCost=(totalCost*0.9)*0.8;
				}else if(age>65) {
					totalCost=(totalCost*0.7)*0.8;
				}
				isError=false;
			}break;
			default:{
				isError=true;
			
			}
			
		}
		}
		if(isError) {
			System.out.println("Hatalı veri girdiniz.Lütfen tekrar deneyin!");
		}else {
			System.out.println("Toplam tutar: " + totalCost + "TL");
		}
	
		
	}

}
