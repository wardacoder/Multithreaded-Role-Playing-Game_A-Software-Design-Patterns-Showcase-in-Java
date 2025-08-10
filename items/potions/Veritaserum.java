

public class Veritaserum extends Potion{

	public Veritaserum(Player p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addIngredient() {
		// TODO Auto-generated method stub
		System.out.println("Adding Snake Skin...");
		GameLogic.implicitPressKey();
		this.pl.activePotion = "Veritaserum";
		this.pl.hp+=40;
		if(this.pl.hp>100)
			this.pl.hp=100;
	}

}
