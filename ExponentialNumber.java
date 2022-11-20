package Four;

import java.util.Scanner;

public class ExponentialNumber {
	
	//3^4=3*3*3*3
	
	
	public static int exp(int n1,int n2) {
		if(n2==0) {
			return 1;
		}
		return n1*exp(n1,n2-1);
	}

	public static void main(String[] args) {

		 Scanner input = new Scanner (System.in);
		 System.out.print("Taban değerini giriniz: ");
		 int n1=input.nextInt();
		 System.out.print("Üs değerini giriniz: ");
		 int n2=input.nextInt();
	
		 System.out.println("Sonuç: " + exp(n1,n2));

	}
}
