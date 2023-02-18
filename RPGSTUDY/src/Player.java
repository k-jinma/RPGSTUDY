/**
 * 基本的なPlayerのひな形クラス
 */
public abstract class Player {

	private String name;	// ★private にする
	private String weapon = "素手";
	private String protector = "素手";

	private int hp;
	private int atk;
	private int def;

	//コンストラクタ
	public Player(String name) {
		this.name = name;
	}

	//名前を取得する　★追加
	public String getName() {
		return name;
	}

	//名前をセットする　★追加
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
	void attack(){
		System.out.println( getName() + "は" + weapon + "で攻撃");
	}
	//防御する（防具が必要）
	abstract void defence( int atk );

	//武器を装備する
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	//防具を装備する
	public void setProtector(String protector) {
		this.protector = protector;
	}

	//武器を取り出す
	public String getWeapon() {
		return weapon;
	}

	//防具を取り出す
	public String getProtector() {
		return protector;
	}




}
