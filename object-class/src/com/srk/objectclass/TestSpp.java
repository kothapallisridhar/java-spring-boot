package com.srk.objectclass;

public class TestSpp {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(222);
		emp.setName("Dilip");
		
		System.out.println("emp Hashcode: " + emp.hashCode());
		
		Employee e2 = new Employee();
		System.out.println("e2 Hashcode: " + e2.hashCode());
		
		Employee e3 = new Employee(222, "Sri", 1000000);
		System.out.println("e3 Hashcode: " + e3.hashCode());
		
		Employee e4 = new Employee(222, "Sri", 1000000);
		System.out.println("e4 Hashcode: " + e4.hashCode());
		
		e2 = e3;
		System.out.println("e2 equals e3 or not ? "  + e2.equals(e3));
		System.out.println("e3 equals e4 or not ? "  + e3.equals(e4));
		
	}

}
