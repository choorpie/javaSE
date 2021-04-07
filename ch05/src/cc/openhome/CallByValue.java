package cc.openhome;

public class CallByValue {

	public static void main(String[] args) {
		var c1 = new Customer("Justin");
		some(c1); // c1 參考的物件會被改變嗎？
		System.out.println(c1.name);

		var c2 = new Customer("Justin");
		one(c2); // c2 參考的物件會被改變嗎？
		System.out.println(c2.name);
	}
	
	static void some(Customer c) {
		c.name ="John"; // 改變了哪個物件？
	}
	
	static void one(Customer c) {
		c = new Customer("Bill"); // c 參考了哪個物件？
	}
}

class Customer {
	String name;
	Customer(String name){
		this.name = name;
	}
}