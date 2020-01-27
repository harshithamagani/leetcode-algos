package exmaple.com;

public class FindFirstUnique {
	public static int findFirstUnique(int[] arr) 
	 {
	   boolean isRepeated = false;
	   
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr.length;j++) {
			   if(arr[i] == arr[j] && i != j) {
				   isRepeated = true;
			   }
		   }
		   if(isRepeated == false) {
			   return arr[i];
		   }
		   else {
			   isRepeated = false; 
		   }
	   }
	   return -1; 
	 }
	public static void main(String[] args) {
		int [] arr = {4,4,4,3};
		System.out.println(findFirstUnique(arr));
	}
}
