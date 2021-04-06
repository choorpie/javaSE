package cc.openhome;

public class ShallowCopy {

	public static void main(String[] args) {
		Clothes2[] c1 = {new Clothes2("red", 'L'), new Clothes2("blue", 'M')};
		var c2 = new Clothes2[c1.length];
		
		for(var i=0;i<c1.length;i++) {
			c2[i] = c1[i];
		}
		
		c1[0].color = "yellow";
		System.out.println(c2[0].color);
	}

}
