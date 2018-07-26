import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter a letter"); 
		   String line = sc.nextLine();
		   char c = line.charAt(0);
		   if (Character.isLetter(c))
		   {
		   System.out.printf("Alphabet");
		}
		   else {
			   System.out.println("No");
		   }
		   
}
}
