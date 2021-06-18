import java.util.Scanner;

public class Main extends AccountDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choose;

		do {
			System.out.println("****WELCOME THE USER CATEGORY");
			System.out.println("Please enter action : " + "\n" + "Sign up(1) " + "\n" + "Sign in(2)" + "\n"
					+ "Close User Category(0)" + "\n" + "restart program(3)");
			choose = scanner.nextInt();
			switch (choose) {
			case 1:
				System.out.println("you select sign up !!!" + "\n" + "Continue ? (press enter)");
				AccountManager manager = new AccountManager();
				AccountDetails user = new AccountDetails();
				manager.add(user);

				break;

			case 2:
				System.out.println("you select sign in !!!" + "\n" + "Continue ? (press enter)");
				AccountManager manager2 = new AccountManager();
				AccountDetails user2 = new AccountDetails();
				manager2.add2(user2);
				break;

			case 0:
				System.out.println("\n" + "Closed User Category");
				break;

			default:
				System.out.println("\n" + "Wrong number Please restart program");
			}
		} while (choose == 3);

	}
}
