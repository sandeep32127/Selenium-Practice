package cm.javapractice;

public class Author implements Comparable<Author>{
	
	String authName;
	int authAge;
	String authAddress;
	
	public Author(int age, String name, String address) {
		this.authAge = age;
		this.authAddress = address;
		this.authName = name;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public int getAuthAge() {
		return authAge;
	}

	public void setAuthAge(int authAge) {
		this.authAge = authAge;
	}

	public String getAuthAddress() {
		return authAddress;
	}

	public void setAuthAddress(String authAddress) {
		this.authAddress = authAddress;
	}

	@Override
	public int compareTo(Author auth) {
		return this.authName.compareTo(auth.authName);
	}
}
