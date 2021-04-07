package cc.openhome;

public class CallByValue {

	public static void main(String[] args) {
		var c1 = new Customer("Justin");
		some(c1); // c1 �ѦҪ�����|�Q���ܶܡH
		System.out.println(c1.name);

		var c2 = new Customer("Justin");
		one(c2); // c2 �ѦҪ�����|�Q���ܶܡH
		System.out.println(c2.name);
	}
	
	static void some(Customer c) {
		c.name ="John"; // ���ܤF���Ӫ���H
	}
	
	static void one(Customer c) {
		c = new Customer("Bill"); // c �ѦҤF���Ӫ���H
	}
}

class Customer {
	String name;
	Customer(String name){
		this.name = name;
	}
}