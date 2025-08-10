

public abstract class Battle extends ConcreteObserver{

	int gameEndTime;
	boolean gameRunning = true;
	Player pl;
	Enemy en;
	Clock cl;
	
	public Battle(ConcreteSubject[] subjects, int gameEndTime, Player p, Clock cl) {
		super(subjects);
		this.gameEndTime = gameEndTime;
		this.pl = p;
		this.cl = cl;
	}
	
	public void stopClock() {
		cl.t.stop();
	}
	
	public abstract void update(Message m);
	public void fight() {
		
		boolean disarm = false;
		// TODO Auto-generated method stub
		while(gameRunning) {
			GameLogic.clearConsole();
			int attkVal = pl.attack();
			en.updateHP(attkVal);
			if(attkVal==5) 
				disarm = true;
			if(disarm==false)
				pl.updateHP(en.attack());
			if(!(attkVal==5) && !(attkVal==100))
				System.out.println(pl.name + ": " + pl.hp + "\n" + en.name + ": " + en.hp);
			GameLogic.implicitPressKey();
			if(pl.hp==0)
			{
				GameLogic.clearConsole();
				GameLogic.printHeading("YOU LOST - GAME OVER");
				this.cl.done = 1;
				this.cl.t.stop();
				System.exit(0);
			}
			else if (en.hp==0)
			{	
				GameLogic.printHeading("YOU WON");
				gameRunning=false;
				this.cl.done =1;
				this.cl.t.stop();
				GameLogic.pressKey();
			}
			}
		}
}
