package cc.openhome;

class Other {
	{
		System.out.println("�����l�϶�");
	}
	Other() {
		System.out.println("Other() �غc��");
	}
	Other(int o) {
		this(); // this()�N��I�s�t�@�ӫغc��, �|�ھڤ޼ƫ��A�P�ӼƨM�w�I�s���ӫغc��
		System.out.println("Other(int o) �غc��");
	}
}
public class ObjectInitialBlock {

	public static void main(String[] args) {
		new Other(1);
	}

}
