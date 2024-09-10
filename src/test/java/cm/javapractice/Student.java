package cm.javapractice;

public class Student implements Comparable<Student>{


	int studentAge;
	String studentName;
	String studentAddress;

	public Student(int age, String name, String address) {
		this.studentAge = age;
		this.studentName = name;
		this.studentAddress = address;
	}

	public int compareTo(Student stud) {
		
		return this.studentName.compareTo(stud.studentName);
		/*
		 * if(this.studentAge == stud.studentAge) { return 0; }else if(this.studentAge >
		 * stud.studentAge) { return 1; }else return -1;
		 */
	}
}
