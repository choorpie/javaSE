package cc.openhome;

class Some {
	void someMethod(int i) {
		System.out.println("int �����Q�I�s");
	}
	void someMethod(Integer integer) {
		System.out.println("Integer �����Q�I�s");
	}
}

public class OverloadBoxing {

	public static void main(String[] args) {
		var s = new Some();
		s.someMethod(1); // �S���˽c�e�Y�i�ŦX�޼ƭӼƻP���A����k

	}

}
