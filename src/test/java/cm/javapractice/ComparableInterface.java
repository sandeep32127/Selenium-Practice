package cm.javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {

	public static void main(String[] args) {
		List<Student> studList = new ArrayList<Student> ();
		
		studList.add(new Student(21, "Sid", "Dhenkanal"));
		studList.add(new Student(23, "Kiara", "Delhi"));
		studList.add(new Student(30, "Varun", "Mumbai"));
		studList.add(new Student(25, "Ajay", "Maharastra"));
		studList.add(new Student(24, "Sallu", "Bareli"));
		studList.add(new Student(26, "Amir", "Ghosda"));
		
		Collections.sort(studList);
		
		for (Student student : studList) {
			System.out.println(student.studentName + " Address " +student.studentAddress + " Age "+ student.studentAge);
		}
	}
}
