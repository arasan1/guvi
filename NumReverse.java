import java.util.Scanner;

public class NumReverse{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=Integer.toString(a);
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();
		System.out.println(sb);
	}
} 
