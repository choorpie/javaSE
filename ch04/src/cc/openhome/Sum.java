package cc.openhome;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		var console = new Scanner(System.in);
		
		var sum = 0;
		var number = 0;
		
		do {
			System.out.print("��J�Ʀr�G");
			number = Integer.parseInt(console.nextLine());
			sum += number;
		} while(number!=0);
		
		System.out.println("�`�M�G"+sum);
		
		console.close();
	}

}
