package Two;

import java.util.Scanner;
/*
 * Eğer girilen ders notları 0 veya 100 arasında 
 * değil ise ortalamaya katılmasın.
 */
public class SınıfıGeçmeDurumu {

	public static void main(String[] args) {
		int math,phy,tll,chem,music;
		int toplam=0;
		double average,dersSayısı=0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Matematik notunuz: ");
		math=input.nextInt();
		if(math<0 || math>100) {
			System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
		}else {
			toplam+=math;
			dersSayısı++;
		}
		System.out.print("Fizik notunuz: ");
		phy=input.nextInt();
		if(phy<0 || phy>100) {
			System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
		}else {
			toplam+=phy;
		    dersSayısı++;
	    }
		System.out.print("Türkçe notunuz: ");
		tll=input.nextInt();
		if(tll<0 || tll>100) {
			System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
		}else {
			toplam+=tll;
			dersSayısı++;
		}
		System.out.print("Kimya notunuz: ");
		chem=input.nextInt();
		if(chem<0 || chem>100) {
			System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
		}else {
			toplam+=chem;
			dersSayısı++;
		}
		System.out.print("Müzik notunuz: ");
		music=input.nextInt();
		if(music<0 || music>100) {
			System.out.println("Geçersiz not.Ortalamaya dahil edilmedi!");
		}else {
			toplam+=music;
			dersSayısı++;
		}
		
		average=toplam/dersSayısı;
		if(average<=55) {
			System.out.println("Sınıfta kaldınız!");
		}else {
			System.out.println("Sınıfı geçtiniz!");
		}

		System.out.println("Ortalamanız: " + average);
		
		
	}

}
