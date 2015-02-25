import java.util.Scanner;

public class NameGen {
	private static String fName, mName, lName,gender,fullName;
	private static Generator gen = new Generator();
	static Scanner scan = new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("Starting Name Generator");
		System.out.println("What Gender do you want? (male/female)");
		gender = scan.nextLine();
		System.out.println("Choosing First Name...");
		fName = gen.createFirstName(gender);
		System.out.println("Choosing Middle Name... ");
		mName = gen.createMiddleName();
		System.out.println("Choosing Last Name... ");
		lName = gen.createLastName();
		
		fullName = fName + " " + mName + " " + lName;
		System.out.println("Your name is: " + fullName);
		

	}

	public String createMiddleName() {
		String name = "";

		mName = name;

		return mName;

	}

}
