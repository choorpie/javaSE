package cc.openhome;

public class MathTool {
	// �䴩 ���w���פ޼�(Variable-length Argument)
	public static int sum(int... numbers) {
		var sum = 0;
		for(var number:numbers) { // �ϥμW�j��for�j��, ���o���w���פ޼Ƥ����C�Ӥ���
			sum += number;
		}
		return sum;
	}

}
