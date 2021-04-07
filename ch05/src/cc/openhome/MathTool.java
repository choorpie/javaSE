package cc.openhome;

public class MathTool {
	// 支援 不定長度引數(Variable-length Argument)
	public static int sum(int... numbers) {
		var sum = 0;
		for(var number:numbers) { // 使用增強式for迴圈, 取得不定長度引數中的每個元素
			sum += number;
		}
		return sum;
	}

}
