
public class Magician extends Player {

	public Magician(String name) {
		super(name);
	}

	@Override
	void defence(int atk) {
		//魔法使いは素手では防御できない
		if(this.getProtector().equals("素手")==false) {
			System.out.println( getName() + "は" + getProtector() + "で防御");
		}else {
			System.out.println( getName() + "は" + getProtector() + "で防御");
		}
	}

}
