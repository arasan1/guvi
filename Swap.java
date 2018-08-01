import java.util.Scanner;

public class Swap{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.print(a);
		System.out.print(" "+b);
}
}
