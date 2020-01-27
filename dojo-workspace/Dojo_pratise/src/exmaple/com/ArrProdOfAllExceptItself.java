package exmaple.com;

import java.util.Arrays;

public class ArrProdOfAllExceptItself {
	public static int[] findProductEff(int arr[])  {
		int n = arr.length;
	    int i, temp = 1; 

	    // Allocation of result array
	    int result[] = new int[n]; 

	    // Initializing the result array by 1
	     
	    System.out.println(Arrays.toString(result));
	    // Product of elements on left side excluding arr[i]
	    for (i = 0; i < n; i++)  
	    { 
	      result[i] = temp; 
	      System.out.println(temp);
	      temp *= arr[i]; 
	    } 
	    System.out.println(Arrays.toString(result));
	    // Initializing temp to 1 for product on right side
	    temp = 1; 

	    // Product of elements on right side excluding arr[i] 
	    for (i = n - 1; i >= 0; i--)  
	    { 
	      result[i] *= temp; 
	      temp *= arr[i]; 
	    }

	    return result; 
	  } 
	
	//brute force way 0(n2)
	public static int[] findProduct(int arr[])  
	  {    
	    int [] result = new int[arr.length];
	    
	    for(int i=0;i<arr.length;i++) {
	    	int prod = 1;
	    	for(int j=0;j<arr.length;j++) {
	    		
	    		if(i==j) {
	    			//break;
	    		}
	    		else {
	    			prod*=arr[j];
	    		}
	    	}
	    	result[i]=prod;
	    }
	    // write your code here

	    return result; 
	   } 

	public static void main(String[] args) {
		int [] arr = {1,2,0,4};
		int [] newArr = findProductEff(arr);
		System.out.println(Arrays.toString(newArr));
	}
}
