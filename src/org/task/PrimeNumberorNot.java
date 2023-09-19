package org.task;

import java.util.Scanner;

public class PrimeNumberorNot {
	
	public static void main(String[] args) {
		
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		
		int count=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				count=1;
			}
		}
		if(count==0) {
				System.out.println(" Prime number");
			}else {
				System.out.println("not prime number");
				
			}
		}
		
	

	
}
