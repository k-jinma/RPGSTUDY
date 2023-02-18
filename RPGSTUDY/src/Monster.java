
public class Monster {
	private String name;
	private int hp;
	private int atk;
	private int def;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}

	//攻撃する
	void attack(Player p){
		System.out.println( getName() + "は" + p.getName() + "を攻撃！" + atk + "のダメージ！");
		p.defence(atk);
	}

}
