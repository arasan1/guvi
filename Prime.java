import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num;
		int i;
		int count=0;
		Scanner sc = new Scanner(System.in);
		 num=sc.nextInt();
		for(i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;	
			}	
		}
		if(count==0){
			System.out.println("yes  ");
		}
		else {
			System.out.println("no");
		}		
	}
}
