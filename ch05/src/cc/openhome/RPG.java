package cc.openhome;

public class RPG {
	public static void main(String[] args) {
		demoSwordsMan();
		demoMagician();

	}
	
	static void demoSwordsMan() {
		var swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		System.out.printf("�C�h�G(%s, %d, %d)%n",
				swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());
	}
	
	static void demoMagician() {
		var magician = new SwordsMan();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("�]�k�v�G(%s, %d, %d)%n",
				magician.getName(), magician.getLevel(), magician.getBlood());
	}
}