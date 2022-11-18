package Three;

public class PrimeNumber {

	public static void main(String[] args) {

		
		//1-100 Arasındaki Asal Sayıları Bulan Program
		
	
		
		int counter=0; 
		
		for(int i=2;i<=100;i++) {
			for(int mod=2; mod<i;mod++) {
				if(i%mod==0) {
					counter++;
				}
			}
			if(counter==0) {
				System.out.println(i);
			}
		
			counter=0;
		}
		
		
		
		
		
		
		
		
	}

}
