import java.util.Scanner;

public class LabNumber4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String contString = "yes";
		while (contString.equalsIgnoreCase("yes")) {

			int i;
			
			// prompts user for number
			System.out.println("Please enter a number.");
			int userNum = scan.nextInt();

			for (i = 1; i <= userNum; i++) {
				System.out.println(i + "  " + (i * i) + "  " + (i * i * i));

			}
			// prompts if user wants to continue or not
			System.out.println("Continue? (yes/no)");
			contString = scan.next();
		}
		System.out.println("Goodbye.");
	}

}
