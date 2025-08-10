

public class SlytherinBattle extends Battle{

	public SlytherinBattle(ConcreteSubject[] subjects, int gameEndTime, Player p, Clock cl) {
		super(subjects, gameEndTime, p, cl);
		this.en = new Enemy("Salazar", 100);
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public void update(Message m) {	
		int timePassed = m.payload;
		int remainingTime = gameEndTime - timePassed;
		if(remainingTime == 0) {
			gameRunning = false;
			GameLogic.clearConsole();
			GameLogic.printHeading("YOU LOST - GAME OVER");
			this.cl.done = 1;
			this.cl.t.stop();
			System.exit(0);
			GameLogic.pressKey();
		}else if(gameRunning){
			if(remainingTime!=1) {
				System.out.print(m.origin);
				System.out.println(" Slytherin Battle " + m.topic + ": " + remainingTime + " seconds left until the end of the battle!");
			}else {
				System.out.print(m.origin);
				System.out.println("Slytherin Battle " + m.topic + ": " + remainingTime + " second left until the end of the battle!");
			}
		}
		
	}
}
	


