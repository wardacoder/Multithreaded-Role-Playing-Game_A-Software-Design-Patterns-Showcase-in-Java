

public class Wolfsbane extends Potion{

	public Wolfsbane(Player p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addIngredient() {
		// TODO Auto-generated method stub
		System.out.println("Adding Wolf Elixir...");
		GameLogic.implicitPressKey();
		this.pl.activePotion = "Wolfsbane";
		this.pl.hp+=80;
		if(this.pl.hp>100)
			this.pl.hp=100;
	}

}
