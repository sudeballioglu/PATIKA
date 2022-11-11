package Two;

import java.util.Scanner;

public class FlightTicket {
	/*
	 * mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
	 * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
	 *  Mesafe başına ücret 0,10 TL / km olarak alın.
	 *  İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
	 *  ! Kullanıcıdan alınan değerler geçerli(mesafe ve yaş değerleri pozitif sayı,yolculuk tipi ise 1 veya 2) olmalıdır.
	 *    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
	 *  ! Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
	 *  !Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
	 *  !Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
	 *  !Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
	 *  
	 */

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
