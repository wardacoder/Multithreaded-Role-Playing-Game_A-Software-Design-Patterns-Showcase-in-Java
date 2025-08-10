

public class Context {
	Player pl;
	public int ended = 0;
	private State state;
	
	Context(Player p) {
		this.pl = p;
		this.state = new Intro(p);
		}
	
	public void nextState() {
	state.next(this);
	}
	public void printScene() {
	state.printIntro();
	}
	public void setState(State state) {
	this.state = state;
	}
}
