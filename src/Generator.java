import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class Generator {

	ArrayList<String> fName = new ArrayList<String>();
	ArrayList<String> mName = new ArrayList<String>();
	ArrayList<String> lName = new ArrayList<String>();
	Random rand = new Random();

	String fNameMaleFile = "files/firstMale.txt";
	String fNameFemaleFile = "files/firstFemale.txt";
	String mNameFile = "files/";
	String lNameFile = "files/";

	public String createFirstName(String gender) {
		int random;

		String name;
		if (gender.equalsIgnoreCase("male")) {
			readFile(fNameMaleFile);
			random = rand.nextInt(fName.size() - 1);
			name = fName.get(random);
		} else if (gender.equalsIgnoreCase("female")) {
			name = "Josephine";
		} else {
			name = null;
		}
		return name.trim();
	}

	public String createMiddleName() {
		String name = "Thomas";
		return name;
	}

	public String createLastName() {
		String name = "Beneski";
		return name;
	}

	public void readFile(String file) {

		try {
			for (String line : Files.readAllLines(Paths.get(file),
					Charset.defaultCharset())) {
				if ((file.equals(fNameMaleFile))
						|| (file.equals(fNameFemaleFile))) {
					fName.add(line);
				} else if (file.equals(mNameFile)) {
					mName.add(line);
				} else if (file.equals(lNameFile)) {
					lName.add(line);
				}

				fName.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
