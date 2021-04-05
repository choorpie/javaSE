package cc.openhome;

public class IntegerDemo {
	public static void main(String[] args) {
		// 包裹基本型態
//		int data1 = 10;
//		int data2 = 20;
//		var wrapper1 = new Integer(data1); // 已被棄用(Deprecated)
//		var wrapper2 = new Integer(data2);
		
		Integer data1 = 10;
		Integer data2 = 20;
		
		System.out.println(data1 / 3); // 基本型態運算
		System.out.println(wrapper1.doubleValue() / 3); // 操作包裹器方法
		System.out.println(wrapper1.compareTo(wrapper2));
	}
}
