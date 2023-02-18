import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Fighter f1 = new Fighter("戦士１");
		f1.setAtk(5);
		f1.setDef(4);
		f1.setHp(10);
		Fighter f2 = new Fighter("戦士２");
		Magician m1 = new Magician("魔法使い１");
		Magician m2 = new Magician("魔法使い２");

		ArrayList<Player> party1 = new ArrayList<Player>();
		party1.add(f1);
		party1.add(m1);
		party1.add(m2);
		party1.add(f2);

		f1.setWeapon("銅の剣");
		f1.setProtector("銅の盾");
		f2.setWeapon("鉄の斧");
		m1.setWeapon("ブロンズロッド");
		m2.setProtector("木の盾");


//		//全員攻撃 - ポリモーフィズムの例
//		for( int i = 0; i < party1.size(); i++ ) {
//			party1.get(i).attack();
//		}
//
//		//全員防御 - ポリモーフィズムの例
//		for( int i = 0; i < party1.size(); i++ ) {
//			party1.get(i).defence();
//		}

		Monster mon1 = new Monster();
		mon1.setHp(8);
		mon1.setAtk(3);
		mon1.setDef(2);

		mon1.setName("スライム");
		mon1.attack(f1);
		mon1.attack(f1);

	}

}
