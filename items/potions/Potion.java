

public abstract class Potion {
	
	Player pl;
	
	public Potion(Player p) {
		this.pl = p;
	}
	
	final void preparePotion() {
		addIngredient();
		Brew();
		stirAndBoil();
	}
	
	protected void Brew() {
		System.out.println("Brewing potion...");
		GameLogic.implicitPressKey();
	}
	
	protected void stirAndBoil() {
		System.out.print("Stiring and Boiling...done! ");
		System.out.println("🧪💨");
		GameLogic.implicitPressKey();
	}
	
	abstract void addIngredient();

}
