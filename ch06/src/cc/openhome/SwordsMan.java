package cc.openhome;

public class SwordsMan extends Role{
	@Override
	public void fight() {
		System.out.println("揮劍攻擊");
	}
	@Override
	public String toString() {
		return "劍士" + super.toString(); // 希望利用父類別中的方法, 再作些加工修改
	}
}
