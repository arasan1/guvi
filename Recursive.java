import java.util.Scanner;

public class Recursive{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		if(a%2==0) {
		a=a/2;
		System.out.println(a);
		}
		else
			System.out.println(a);
	}
	
}
