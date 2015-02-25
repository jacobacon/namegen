public class Generator {
	public String createFirstName(String gender) {
		String name;
		if(gender.equalsIgnoreCase("male")){
			name = "Jacob";
		}
		else
			if(gender.equalsIgnoreCase("female")){
				name = "Josephine";
			}
			else{
				name = null;
			}
		return name;
	}

	public String createMiddleName() {
		String name = "Thomas";
		return name;
	}

	public String createLastName() {
		String name = "Beneski";
		return name;
	}

}
