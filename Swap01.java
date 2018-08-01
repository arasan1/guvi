import java.util.Scanner;

public class Swap01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.print(a);
		System.out.print(" "+b);		
}
}
