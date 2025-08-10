
public abstract class Act implements State {

	Player pl;
	String name;
	Clock clock = new Clock();
	ConcreteSubject[] subjects = {clock};
	
	
	Act(Player p) {
		this.name = p.name;
		this.pl = p;
		clock.t.start();
	}
	
	public abstract void next(Context context);

	public abstract void printIntro();
	
	public abstract void printOutro();
	
}
