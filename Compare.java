import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int a=str.length();
		int b=str1.length();
		if(a==b) {
			System.out.println(str);
		}
		else if(a>b) {
			System.out.println(str);
		}
		else {
			System.out.println(str1);
		}	
	}
}
