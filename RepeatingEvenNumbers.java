package Seven;

public class RepeatingEvenNumbers {
	
	static boolean isRepeat(int[] arr,int value) {
		for(int i:arr) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		
		int[] numbers = {1,3,2,53,56,65,4,6,12,33,2,4,17,6,6,14};
		int[] duplicate=new int[numbers.length];
		
		int startIndex=0;
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if((i!=j)&& numbers[i]==numbers[j]) {
					if(!isRepeat(duplicate,numbers[i])) {
						duplicate[startIndex++]=numbers[i];
					}
					break;
				}
			}
		}
		
		for(int value : duplicate) {
			if(value!=0 && value%2==0) {
				System.out.print(value + " ");
			}
		}
		
	}

}
