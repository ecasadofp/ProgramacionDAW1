package treeSetUser;

import java.util.Comparator;

public class UserSalaryComparator implements Comparator<User> {

	// This compares employees based on salaries
	@Override
	public int compare(User o1, User o2) {
		if (o1.getSalary() >= o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}
