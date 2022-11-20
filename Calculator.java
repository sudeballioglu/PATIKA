package Four;

import java.util.Scanner;

public class Calculator {

	//Toplama
	static void plus() {
		Scanner scan = new Scanner (System.in);
		int number,result=0,i=1;
		
		while(true) {
			System.out.print(i++ + ". sayı : " );
			number=scan.nextInt();
			if(number==0) {
				break;
			}
			result+=number;
		}
		System.out.println("Sonuç: " + result);
	}
	
	//Çıkarma
	static void minus() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Kaç sayı gireceksiniz: ");
		int counter=scan.nextInt();
		int number,result=0;
		
		for(int i=1;i<=counter;i++) {
			System.out.print(i + ". sayı: ");
			number=scan.nextInt();
			if(i==1) {
				result+=number;
				continue;
			}
			result-=number;
		}
		System.out.println("Sonuç: " + result);
	}
	
	//Çarpma
	static void times() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Kaç adet sayı gireceksiniz: ");
		int counter = scan.nextInt();
		int number,result=1;
		
		for(int i=1;i<=counter;i++) {
			System.out.println(i + ". sayı: ");
			number=scan.nextInt();
			
			if(number==0) {
				result=0;
				break;
			}
			result*=number;
		}
		System.out.println("Sonuç: " + result);
	}
	
	//Bölme
	static void divided() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Kaç adet sayı gireceksiniz: ");
		int counter = scan.nextInt();
		double number,result=0;
		
		for(int i=1;i<=counter;i++) {
			System.out.print(i + ". sayı: ");
			number=scan.nextDouble();
			
			if(i!=1 && number==0) {
				System.out.println("Böleni o giremezsiniz.");
				continue;
			}
			if(i==1) {
				result=number;
				continue;
			}
			result/=number;
		}
		System.out.println("Sonuç: " + result);
	}
	
	
	//Üslü Sayı Hesaplama
	static void power() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Taban değeri giriniz: ");
		int base=scan.nextInt();
		System.out.print("Üs değerini giriniz: ");
		int exponent=scan.nextInt();
		int result=1;
		
		for(int i=1;i<=exponent;i++) {
			result*=base;
		}
		System.out.println("Sonuç: " + result);
	}
	
	//Faktoriyel Hesaplama
	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int number=scan.nextInt();
		int result=1;
		
		for(int i=1;i<=number;i++) {
			result*=i;
		}
		System.out.println("Sonuç: " + result);
	}
	
	// Mod Alma
	static void mod() {
		Scanner scan = new Scanner (System.in);
		System.out.print("İlk sayıyı giriniz: ");
		int n1=scan.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int n2=scan.nextInt();
		int result=n1%n2;
		System.out.println("Sonuç: " + result);
	}
	
	
	//Dikdörtgen Alan ve Çevre Hesabı
	static void rect() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
		int shortEdge = scan.nextInt();
		System.out.println("Dikdörtgenin uzun kenarını giriniz: ");
		int longEdge = scan.nextInt();
		
	if(shortEdge>0 && longEdge>0) {
		int area=shortEdge*longEdge;
		int perimeter=(shortEdge+longEdge)*2;
		System.out.println("Dikdörtgenin alanı: " + area);
		System.out.println("Dikdörtgenin çevresi: " + perimeter);
	}
		System.out.println("Kenar sıfırdan küçük olamaz.Tekrar deneyiniz.");
	}
	
	
	public static void main(String[] args) {

		
		int select;
		Scanner scan = new Scanner (System.in);
		
		 String menu = "1- Toplama İşlemi\n"
	                + "2- Çıkarma İşlemi\n"
	                + "3- Çarpma İşlemi\n"
	                + "4- Bölme işlemi\n"
	                + "5- Üslü Sayı Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
	                + "0- Çıkış Yap";
		 
		 do {
			 System.out.println(menu);
			 System.out.print("Lütfen bir işlem seçiniz:");
			 select=scan.nextInt();
			 switch(select) {
			 case 1:
				 plus();
				 break;
			 case 2:
				 minus();
				 break;
			 case 3:
				 times();
				 break;
			 case 4:
				 divided();
				 break;
			 case 5:
				 power();
				 break;
			 case 6:
				 factorial();
				 break;
			 case 7:
				 mod();
				 break;
			 case 8:
				 rect();
				 break;
			 case 0:
			 break;
			 
			 default:
				 System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
			
			 }
		 }while(select!=0);
		 
		 }
}