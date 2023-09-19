package org.task;

import java.util.Scanner;

public class SumoftheGivenNumber {
	
	public static void main(String[] args) {
	
		int n,m,sum=0;
		m=12345;
		while(m>0) {
			n=m%10;
			sum=sum+n;
			m=m/10;
		}
		System.out.println("sum of the number:"+sum);
		}

}
