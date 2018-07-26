import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input :");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}
		else if(a<0) {
			System.out.println("invalid");
		}
		else {
			System.out.println("odd");
		}
		
		}

	}
