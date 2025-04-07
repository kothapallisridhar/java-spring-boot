package com.srk.typecasting;

public class TypeCastingData {

	public static void main(String[] args) {
		
		// implicit casting
		Object obj = new Student();
		
		// calling method of Student class: getStudentInfo()
		
		// Down casting
		Student student = (Student)obj;
		student.getStudentInfo();

	}

}
