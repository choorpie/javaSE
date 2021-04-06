package cc.openhome;

class CashCard {
	String number;
	int balance;
	int bonus;
	
	CashCard(String number, int balance, int bonus){
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	
	void store(int money) { // �x�ȮɩI�s����k
		if(money>0) {
			this.balance += money;
			if(money>=1000) {
				this.bonus++;
			}
		}
		else {
			System.out.println("�x�ȬO�t���H�A�Ӷê��ܡH");
		}
	}
	
	void charge(int money) { // ���ڮɩI�s����k
		if(money>0) {
			if(money<=this.balance) {
				this.balance-=money;
			}
			else {
				System.out.println("�������աI");
			}
			
		} else {
			System.out.println("���t�ơH�o�O�b�s���x�ȶܡH");
		}	
	}
	
	int exchange(int bonus) { // �I�����Q�I�ƮɩI�s����k
		if(bonus>0) {
			this.bonus-=bonus;
		}
		return this.bonus;
	}
}
