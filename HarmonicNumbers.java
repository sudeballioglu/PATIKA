package Seven;

import java.util.Arrays;

public class HarmonicNumbers {

	public static void main(String[] args) {

		double[] numbers= {1,2,3,4,5                     };
		double[] harmonic=new double[numbers.length];
		
		double sum=0;
		
		for(int i=0;i<numbers.length;i++) {
			harmonic[i]=1/numbers[i];
			sum+=harmonic[i];
			}

		System.out.println("Harmonic Average: " + harmonic.length/sum);
	}

}
