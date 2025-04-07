package com.srk;

public class BranchingStatements { 

	public static void main(String[] args) {
		
		// break
		// Req: when value 25 is found, stop the execution of other values
		for(int i = 10; i<=30; i++) {
			
			if(i == 25) {
				break;
			}
			System.out.println("The value is: " + i);
			System.out.println("It's a valid value");
		}
		
		// continue
		// Req: 10 - 30
		// when 17 divisible value is found, print it 
		
		for(int i = 10; i <= 30; i++) {
			
			if(i % 17 != 0) {
				continue;
			}
			System.out.println("This is valid value: " + i);
			System.out.println("Matching is found, I am making some operations below");
			
		}
		
		

	}

}
