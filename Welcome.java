import java.util.Scanner;

public class Welcome{
	public static void main(String args[]){

		String first;
		String last;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		first = sc.nextLine();

		System.out.print("Enter your last name: ");
		last = sc.nextLine();

		System.out.printf("Welcome to the Second Year %s %s\n",first,last);

						


	}



}