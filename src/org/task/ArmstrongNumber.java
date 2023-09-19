package org.task;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 
		int a,i=0,j=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		a=num;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		}
		if(num==j) {
			System.out.println(" armstrog number");
		}
		else
		{
			System.out.println(" not armstrong number");
		}
		
		
	}
}
