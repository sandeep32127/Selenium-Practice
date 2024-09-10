package cm.javapractice;

public class Nan {

	public static void main(String[] args) {
		//System.out.println(2/0);
		
		System.out.println(2.0/0.0);
		
		System.out.println(0.0/0.0);
		
		System.out.println(Math.sqrt(-1));
		
		System.out.println(Float.NaN == Float.NaN);
		
		System.out.println(Float.NaN != Float.NaN);
		
		System.out.println(Long.valueOf((long) (Math.floor(Math.random() * 9000000000L) + 900000000L)));
		
		double nan = 2.0 % 0 ;
		System.out.println(nan == (2.0 % 0));
		System.out.println(nan != nan);
		
		System.out.println(Math.floor(10.9999));
	}

}
