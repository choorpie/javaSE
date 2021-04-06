package homework;

import java.util.Scanner;

public class Question_1_nonrecurrsion {

	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		number = scanner.nextInt();
		
		if(number == 0) {
			System.out.println("last Fibonacci num = 0");
		} else if(number == 1) {
			System.out.println("last Fibonacci num = 1");
		} else {
			int res = calculate(number);
			System.out.println("last Fibonacci num = "+res);
		}
	}
	
	static int calculate(int num) {
		int n1 = 0;
		int n2 = 1;
		int res = 0;
		for(int v=2;v<=num;v++) {
			res = n1+n2;
			n1 = n2;
			n2 = res;
		}
		
		return res;
	}
}
