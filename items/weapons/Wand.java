

public class Wand {
	
	Command[] spells;
	
	public Wand(Command[] sp) {
		this.spells = sp;
	}
	
	public int cast(int i) {
		return this.spells[i].execute();
	}
}
