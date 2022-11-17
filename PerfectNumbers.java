package Three;

import java.util.Scanner;

public class PerfectNumbers {
	
	//12 
	//1 2 3 4 6        12

	public static void main(String[] args) {

		int number,total=0;
		boolean condition=true;
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.print("Enter a number: ");
			number=input.nextInt();
			if(number>0) {
			for(int i=1;i<number;i++) {
				if(number%i==0) {
					total+=i;
				}
			}
			if(total==number) {
				System.out.println(number + " is a perfect number. ");
				total=0;
			}else {
				System.out.println(number + " is not a perfect number.");
				total=0;
			}
		}else {
			System.out.println("Invalid number.");
		}
			}while(condition);
		
	}

}
