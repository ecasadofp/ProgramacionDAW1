package treeSetUser;
public class User implements Comparable<User> {

	private String firstName;
	private String lastName;
	private int salary;

	public User(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName + " " + salary;
	}

	@Override
	public int compareTo(User o) {
		return this.firstName.compareTo(o.firstName);
	}
}
