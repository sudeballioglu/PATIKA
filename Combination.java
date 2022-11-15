package Three;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {

		/*
		 *  Java ile kombinasyon hesaplayan program yazınız.
		 *    Kombinasyon formülü    C(n,r) = n! / (r! * (n-r)!)
         */
		
		
		int n,r,f,factn=1,factr=1,factf=1,comb;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Faktöriyel sayısını giriniz: ");
		n=input.nextInt();
		System.out.println("Kaçlı kombinasyonu?");
		r=input.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			factn*=i;
		}
		
		for(int i=1;i<=r;i++) {
			factr*=i;
		}
		
		f=n-r;
		
		for(int i=1;i<=f;i++) {
			factf*=i;
		}
		
		comb=(factn)/(factr*factf);
		
		System.out.println(n + " sayısının " + r + "li kombinasyonu: " + comb);
		
	}

}
