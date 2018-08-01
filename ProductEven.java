import java.util.Scanner;

public class ProductEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int product;
		product=a*b;
		if(product%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
}
}
