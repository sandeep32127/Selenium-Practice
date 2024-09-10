package cm.javapractice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorInterface {

	public static void main(String[] args) {
		ArrayList<Author> authList = new ArrayList<Author>();
		
		authList.add(new Author(21, "Bana", "DKL"));
		authList.add(new Author(23, "Zink", "ANL"));
		authList.add(new Author(26, "Yana", "BLR"));
		authList.add(new Author(30, "Bamur", "DEL"));
		authList.add(new Author(32, "Sara", "RKL"));
		
		Collections.sort(authList);
		
		for (Author author : authList) {
			System.out.println("The author name is :"+author.getAuthName()+ " The author address is : "+author.authAddress+ " The author age is : "+ author.authAge);
		}
		
		System.out.println("Sorting using age comparator");
		
		Collections.sort(authList, new AuthorAgeComparator());
		
		for (Author author : authList) {
			System.out.println("The author name is :"+author.getAuthName()+ " The author address is : "+author.authAddress+ " The author age is : "+ author.authAge);
		}
		
		System.out.println("Sorting using Address comparator");
		
		Collections.sort(authList, new AuthorAddressComparator());
		
		for (Author author : authList) {
			System.out.println("The author name is :"+author.getAuthName()+ " The author address is : "+author.authAddress+ " The author age is : "+ author.authAge);
		}
	}

}
