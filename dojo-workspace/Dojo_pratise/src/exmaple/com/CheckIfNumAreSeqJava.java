package exmaple.com;

public class CheckIfNumAreSeqJava {

	public static boolean solution(int [] arr, int k) {
	    //int n = arr.length;
	    for(int i=0;i<arr.length-1;i++) {
	    	int diff = arr[i+1] - arr[i];
	    	System.out.println(diff);
	    	if((arr[i]  > arr[i+1])){
	    		System.out.println("hello");
	    		 return false;
	    	}
	    	else if(diff>1 || diff<0) {
	    		return false;
	    	}
	    }
	    if(arr[arr.length-1] == k) {
    		return true;
    	}
    	else {
    		return false;
    	}
	}
	public static void main(String[] args) {
		boolean result = solution(new int[] {1,1,2,4,3},3);
		System.out.println(result);
	}
}
