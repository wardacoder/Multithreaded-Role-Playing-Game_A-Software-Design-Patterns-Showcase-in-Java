

public class Intro implements State{
	
	Player pl;
	
	Intro(Player n) {
		this.pl = n;
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		context.setState(new firstAct(pl));
	}

	@Override
	public void printIntro() {
		// TODO Auto-generated method stub
		GameLogic.clearConsole();
		GameLogic.printHeading("The Journey Begings");
		System.out.println(pl.name + " and friends venture into the library to explore the forbidden section" +
		" after overhearing professors Snape and Lupin discussing about it in the hallway. ");
		GameLogic.pressKey();
		System.out.println(pl.name + ": Check this out...Time Travel?!");
		GameLogic.implicitPressKey();
		System.out.println("Lucius: Move let me see!");
		GameLogic.implicitPressKey();
		System.out.println("Eve: I don't have a good feeling about this guys...we should probably get out of here...what if someone sees us?");
		GameLogic.implicitPressKey();
		System.out.println("Lucius: No way! watch me travel to the future and return a fortune teller! everyone's gonna be totally impressed!");
		GameLogic.implicitPressKey();
		System.out.println("*" + pl.name + " flips pages in search for anything interesting*");
		GameLogic.implicitPressKey();
		System.out.println(pl.name + ": I can't find anything...it's all some gibberish");
		GameLogic.implicitPressKey();
		System.out.println("Eve:" + " Let me see...this looks ike parseltongue..I took an elective last semester, I can give reading it a try!");
		GameLogic.implicitPressKey();
		System.out.println("*Eve recites a spell off the current page*");
		GameLogic.implicitPressKey();
		System.out.println("--- Space distorts around the 3 of them; their surroundings begin resembling an older time period ---");
		GameLogic.pressKey();
		printOutro();
	}

	@Override
	public void printOutro() {
		// TODO Auto-generated method stub
		return;
	}
	
	

}
