import javax.swing.JOptionPane;

public class WeekSevenWednessDay {
	private static int attempts = 0;

	public static void main(String[] args) {

		String userName = "";
		boolean valid = false;

		while (!valid && attempts < 4) {
			++attempts;
			userName = JOptionPane.showInputDialog("User Name ");
			valid = validateUserInput(userName);
		}

		if (valid) {
			valid = false;
			while (!valid && attempts < 4) {
				String Pwd = JOptionPane.showInputDialog("Password ");
				valid = validatePassword(userName, Pwd);

				++attempts;
			}
		}

		if (valid) {
			JOptionPane.showMessageDialog(null, "Welcome" + " " + userName);

			String[] choices = { "Admin", "Student", "Staff" };
			valid = false;
			while (!valid) {
				String input = (String) JOptionPane.showInputDialog(null, "Choose account type.", "Account Type",
						JOptionPane.QUESTION_MESSAGE, null, choices, null);

				valid = validateAccountType(userName, input);
			}
		}

	}

	private static void badAttempt() {
		if (attempts >= 3) {
			// Too many wrong attempts.
			JOptionPane.showMessageDialog(null, "Contact Administrator");
			System.exit(0);
		}
	}

	private static boolean validateUserInput(String input) {

		boolean valid = false;
		switch (input) {
		case "Alpha":

		case "Beta":

		case "Echo":
			valid = true;
			break;
		default:
			badAttempt();
			JOptionPane.showMessageDialog(null, "Invalid User Name");
		}
		return valid;
	}

	private static boolean validatePassword(String user, String input) {

		boolean valid = false;
		switch (user) {
		case "Alpha":
			if (input.equals("qwe")) {

				valid = true;
			}
			break;

		case "Beta":
			if (input.equals("asd")) {

				valid = true;
			}
			break;

		case "Echo":
			if (input.equals("zxc")) {

				valid = true;
			}
			break;

		}

		if (!valid) {
			JOptionPane.showMessageDialog(null, "Wrong password");
			badAttempt();
		}
		// The user entered the wrong info 3 times.
		return valid;

	}

	private static boolean validateAccountType(String userName, String input) {
		boolean valid = false;

		switch (input) {
		case "Admin":
			if (userName.equals("Alpha")) {
				System.out.println("Welcome Admin! You can update and read file.");
				valid = true;
			} else {
				break;
			}

		case "Student":
			if (userName.equals("Beta")) {
				System.out.println("Welcome Student! You can only read file.");
				valid = true;
			} else {
				break;
			}

		case "Staff":

			if (userName.equals("Echo")) {
				System.out.println("Welcome Staff! You can update, read, add, delete file.");
				valid = true;
			} else {
				break;
			}
		}
		return valid;
	}

}
