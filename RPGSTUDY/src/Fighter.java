
public class Fighter extends Player {


	public Fighter(String name) {
		super(name);
	}

	@Override
	void defence(int atk) {

		int damage = getDef() - atk;
		//戦士は素手でも防御できる
		System.out.println(getName() + "は" + getProtector() + "で防御");
		System.out.println(getName() + "は" + damage + "ポイントのダメージ！" );

		int hp = getHp() - damage;
		setHp(hp);

		System.out.println("[" + getName() + "のＨＰ：" + getHp() + "]");

	}


}
