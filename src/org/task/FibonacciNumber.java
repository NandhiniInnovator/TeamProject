package org.task;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		
		int a=0,b=1;
		//System.out.println(a);
		//System.out.println(b);
		for(int i=0;i<=5;i++){
		 int c=a+b;
		 System.out.println(c);
		 
		 a=b;
		 b=c;
			
			
		}
	}
}
	
	

