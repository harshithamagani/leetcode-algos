package example.com.string.mani.question;

public class ReverseStr {
	//iterative solution
	public static String strReverse(String str){
		char [] a = str.toCharArray();
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			char temp=a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}
		return String.valueOf(a);
	}
	//recursive solution
	public static String reverse(String str){
		char [] a = str.toCharArray();
		char [] n= reverse(a,0,a.length-1);
		return String.valueOf(n);
	}
	private static char [] reverse(char[] a, int i, int j) {
		if(j>=i) {
			char temp=a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
			return reverse(a,i,j);
		}
		else {
			return a;
		}
	}
	public static void main(String[] args) {
		System.out.println(reverse("see"));
	}
}
