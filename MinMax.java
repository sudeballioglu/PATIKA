package Three;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {


		int n,maxNumber=0,minNumber=0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("How many numbers to enter: ");
		int number = input.nextInt();
		
		for(int i=1; i<=number;i++) {
			System.out.print("Enter the " + i + ". number: ");
			n=input.nextInt();
			
			if(i==1) {
				maxNumber=n;
				minNumber=n;
			}else {
				if(n>maxNumber) {
					maxNumber=n;
				}else if(n<minNumber){
					minNumber=n;
				}
			}
		}
		
		System.out.println("Max number: " + maxNumber);
		System.out.println("Min number: " + minNumber);
			
	}

}
