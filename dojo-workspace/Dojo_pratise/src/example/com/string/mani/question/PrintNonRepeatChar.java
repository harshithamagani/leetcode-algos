package example.com.string.mani.question;

public class PrintNonRepeatChar {
	public static void printFirstNonRepeatCharInStr(String str) {
		char [] a = str.toCharArray();
		boolean repeat=false;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
					if(a[i] == a[j] && i!=j) {
						repeat = true;
					}
			}
			if(!repeat) {
				System.out.println(a[i]);
				return;
			}
			else {
				repeat = false;
			}
		}
	}
	public static void main(String[] args) {
		printFirstNonRepeatCharInStr("applea");
	}
}
