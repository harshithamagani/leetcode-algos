package example.com.string.mani.question;

public class CheckIfStrHasDigit {
	public static boolean checkStrContainsDigit(String str){
		char [] a = str.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(!Character.isDigit(a[i])) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkIfStringHasONlyDigits(String str){
	 String regex = "//d+";
	 if(str.matches(regex)) {
		 return true;
	 }
	 else {
		 return false;
	 }
	}
	public static void main(String[] args) {
		System.out.println(checkStrContainsDigit("89yy"));
	}
}
