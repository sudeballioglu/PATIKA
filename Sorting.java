package Seven;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		int size=scan.nextInt();
		
		int[] list=new int[size];
		
		System.out.println("Dizinin elemanlarını giriniz: ");
		for(int i=0;i<size;i++) {
			System.out.print((i+1) + ". Elemanı : ");
			int number=scan.nextInt();
			list[i]=number;
		}
		
	
		Arrays.sort(list);
		System.out.println("Sıralama: " + Arrays.toString(list));
	}

}
