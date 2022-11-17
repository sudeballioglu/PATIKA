package Three;

import java.util.Scanner;

public class EbobEkok2 {

	public static void main(String[] args) {
		
		
int ebob=0,ekok=0,biggerOne,smallerOne,i=1;
		
		Scanner input = new Scanner (System.in);
		System.out.print("İlk sayıyı giriniz: ");
		int n1=input.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int n2=input.nextInt();
		
		
		if(n1>n2) {
			biggerOne=n1;
			smallerOne=n2;		
		}else {
			biggerOne=n2;
			smallerOne=n1;
		}
		
		
		//EBOB
		
		while(i<=smallerOne) {
			if(n1%i==0 && n2%i==0) {
				ebob=i;
			}
			i++;
		}
		
		//EKOK
		
		while(i<=n1*n2) {
			if(i%n1==0 && i%n2==0) {
				ekok=i;
				break;
			}
			i++;
		}
		
		System.out.println("Ebob: " + ebob);
		System.out.println("Ekok: " + ekok);
	}

}
