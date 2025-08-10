
public class GrindlewaldBattle extends Battle {
	public GrindlewaldBattle(ConcreteSubject[] subjects, int gameEndTime, Player p, Clock cl) {
		super(subjects, gameEndTime, p, cl);
		this.en = new Enemy("Grindlewald", 100);
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("deprecation")
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
			GameLogic.pressKey();
			System.exit(0);
		}else if(gameRunning){
			if(remainingTime!=1) {
				System.out.print(m.origin);
				System.out.println("Grindlewald Battle " + m.topic + ": " + remainingTime + " seconds left until the end of the battle!");
			}else {
				System.out.print(m.origin);
				System.out.println("Grindlewald Battle " + m.topic + ": " + remainingTime + " second left until the end of the battle!");
			}
			
		}

}
	
}
