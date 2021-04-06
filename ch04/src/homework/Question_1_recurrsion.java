package homework;

import java.util.Scanner;

public class Question_1_recurrsion {
	public static void main(String[] args) {
		var number = -1;
		do {
			System.out.print("½Ð¿é¤Jfn¶¥¼h¡G");
			var console = new Scanner(System.in);
			number = console.nextInt();
			System.out.println(fn(number));
//			console.close();
		} while(number!=0);
		
	}
	static int fn(int number) {
		if(number==0)
			return 0;
		else if(number==1)
			return 1;
		else
			return fn(number-1)+fn(number-2);
	}
}
