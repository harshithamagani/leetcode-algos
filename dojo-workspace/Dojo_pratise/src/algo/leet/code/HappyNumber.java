package algo.leet.code;

import java.util.ArrayList;

public class HappyNumber {	
	

	public static ArrayList<Integer> allPrimeNumbers(int num) {
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=2;i<=num;i++) {
			if(isPrime(i)) {
				result.add(i);	
			}
		}
		return result;
	}
	private static boolean isPrime(int num) {
		for(int j=2;j<num;j++) {
			if(num%j == 0) {
				System.out.println("hi"+j+" "+num);
				return false;
			}
		}
		return true;
	}



	public static void main(String[] args) {
		System.out.println(allPrimeNumbers(10).toString());
	}
	
}
