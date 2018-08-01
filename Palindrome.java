import java.util.Scanner;

public class Palindrome{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		int len = str.length();
		
		String str1 = new StringBuffer(str).reverse().toString();
		
		if(str.equals(str1))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
