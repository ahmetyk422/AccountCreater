import java.util.Scanner;

public class AccountManager {

	Scanner scanner = new Scanner(System.in);
	String write1;
	String space;
	String write2;
	String write3;

	public void add(AccountDetails signup1) {
		int repeat;
		do {

			space = scanner.nextLine();
			System.out.print(signup1.name);
			write1 = scanner.nextLine();

			System.out.print(signup1.surname);
			write2 = scanner.nextLine();

			System.out.print(signup1.password);
			write3 = scanner.nextLine();

			System.out.println("\n" + "Your name :" + write1 + "\n" + "Your surname :" + write2 + "\n"
					+ "Your password :" + write3);

			System.out.println("Repeat sign up ?" + "(yes->1)" + "(no->0)");
			repeat = scanner.nextInt();

			switch (repeat) {
			case 1:

				System.out.println();
				break;
			case 0:
				System.out.println("User sign up successfully");
				break;
			default:

				System.out.println("Wrong number");

			}
		} while (repeat >= 1);

	}

	public void add2(AccountDetails signin1) {
		int repeat;
		do {

			space = scanner.nextLine();
			System.out.print(signin1.name);
			write1 = scanner.nextLine();

			System.out.print(signin1.password);
			write3 = scanner.nextLine();

			System.out.println("\n" + "Your name :" + write1 + "\n" + "Your password :" + write3);

			System.out.println("Repeat sign up ?" + "(yes->1)" + "(no->0)");
			repeat = scanner.nextInt();
            
			switch (repeat) {
			case 1:

				System.out.println();
				break;
			case 0:
				System.out.println("User sign up successfully");
				break;
			default:

				System.out.println("Wrong number");

			}
		} while (repeat >= 1);

	}
}