package cm.javapractice;

public class IntegerCaching {

	public static void main(String[] args) {
		
		//Integer caching   -128 to 127
		Integer n1 = -129;
		Integer n2 = -129;
		
		if(n1 == n2) {
			System.out.println("both are equal");
		}else System.out.println("both are not equal");
		
		Integer b1 = new Integer(500);
		Integer b2 = new Integer(500);
		
		if(b1 == b2) {
			System.out.println("both are equal");
		}else System.out.println("both are not equal");
		
		int m1 = 1000;
		int m2 = 1000;
		
		if(m1 == m2) {
			System.out.println("both are equal");
		}else System.out.println("both are not equal");
	}

}
