package cm.javapractice;

import java.util.Comparator;

public class AuthorAddressComparator implements Comparator<Author>{

	@Override
	public int compare(Author o1, Author o2) {
		return o2.authAddress.compareTo(o1.authAddress);
	}

}
