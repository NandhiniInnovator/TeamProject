package org.task;

import java.util.Scanner;

public class ReversrNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =scanner.nextInt();
		
		int a,i=0,j=0;
		a=num;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			}
		System.out.println("Reverse number:"+j);
	}
	
}
