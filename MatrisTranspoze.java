package Seven;

import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoze {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Matrisinin boyutlarını giriniz.");
		System.out.print("Matrisin satır sayısı: ");
		int row=scan.nextInt();
		System.out.print("Matrisin sütun sayısı: ");
		int col=scan.nextInt();
		
		int[][] matris = new int[row][col];
		int[][]transpoze=new int[col][row];
		
		System.out.println("Matrisin elemanlarını giriniz: ");
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[i].length;j++) {
				System.out.print("Matris [" + i +"] [" + j + "] = " );
				matris[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Matris: ");

		for(int i=0; i<matris.length;i++) {
			for(int j=0;j<matris[i].length;j++) {
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}

		
		for(int i=0; i<transpoze.length;i++) {
			for(int j=0;j<transpoze[i].length;j++) {
				transpoze[i][j]=matris[j][i];
			}
		}
		
		
		System.out.println("Transpoze: ");
		for(int i=0; i<transpoze.length;i++) {
			for(int j=0;j<transpoze[i].length;j++) {
				System.out.print(transpoze[i][j] + " ");
			}
			System.out.println();
		}
	}

}
