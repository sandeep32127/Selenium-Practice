package cm.javapractice;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author>{


	@Override
	public int compare(Author o1, Author o2) {
		if(o1.authAge == o2.authAge) {
			return 0;
		}else if(o1.authAge > o2.authAge) {
			return 1;
		}else return -1;
	}

}
