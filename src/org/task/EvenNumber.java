
package org.task;

import java.util.Scanner;

public class EvenNumber {

	
	private void ifstatement(){
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the value");
	int num = scanner.nextInt();
	
	if(num%2==0) {
		System.out.println("Enter the even number");
	}else {
		System.out.println("Enter the odd number");
	}
	}
	public static void main (String args[]) {
		
		EvenNumber even =  new EvenNumber();
		even.ifstatement();
	}
	}

