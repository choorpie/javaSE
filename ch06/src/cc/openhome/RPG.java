package cc.openhome;

public class RPG {

	public static void main(String[] args) {
		var swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		System.out.printf("�C�h�G(%s, %d, %d)%n",
				swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());
		
		var s = swordsMan.toString();
		System.out.println(s);
		
	}

	
	static void demoMagician() {
		var magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("�]�k�v�G(%s, %d, %d)",
				magician.getName(), magician.getLevel(), magician.getBlood());
	}
	
	static void showBlood(Role role) {
		System.out.printf("%s ��q %d%n",
				role.getName(), role.getBlood());
	}
}
