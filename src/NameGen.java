public class NameGen {
	private String fName, mName, lName;
	private static Generator gen = new Generator();


	public static void main(String[] args) {
		System.out.println("Starting Name Generator");
		System.out.println("Creating First Name:");
		System.out.println(gen.createFirstName());
		

	}

	public String createMiddleName() {
		String name = "";

		mName = name;

		return mName;

	}

}
