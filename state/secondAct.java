

public class secondAct extends Act implements State{
	
	public secondAct(Player p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		context.setState(new thirdAct(pl));
	}

	@Override
	public void printIntro() {
		// TODO Auto-generated method stub
		GameLogic.clearConsole();
		GameLogic.printHeading("The Grindelwald Battle");
		System.out.println(name + " and thiir allies find themselves in a dark and ominous forest, preparing to face the dark wizard Grindelwald and his army of loyal followers."); //we prompt user to lift phone to perform lumous 
		GameLogic.pressKey();
		pl.wand.cast(0);
		GameLogic.implicitPressKey();
		System.out.println("Newt Scammander: Remember, Grindelwald is a powerful wizard. We must be strategic and work together if we hope to defeat him.");
		GameLogic.implicitPressKey();
		System.out.println("Young Dumbledore: We have faced difficult battles before, but this one will be our toughest yet. We cannot give up hope.");
		GameLogic.implicitPressKey();
		System.out.println(pl.name + ": Watch out guys! There he is!\n\n");
		GameLogic.printHeading("Press enter to begin the battle");
		System.out.println("       *\r\n"
				+ "       *   *\r\n"
				+ "     *    \\* / *\r\n"
				+ "       * --.:. *\r\n"
				+ "      *   * :\\ -\r\n"
				+ "        .*  | \\\r\n"
				+ "       * *     \\\r\n"
				+ "     .  *       \\\r\n"
				+ "      ..        /\\.\r\n"
				+ "     *          |\\)|\r\n"
				+ "   .   *         \\ |\r\n"
				+ "  . . *           |/\\\r\n"
				+ "     .* *         /  \\\r\n"
				+ "   *              \\ / \\\r\n"
				+ " *  .  *           \\   \\\r\n"
				+ "    * .  \r\n"
				+ "   *    *    \r\n"
				+ "  .   *    *  ");
		GameLogic.implicitPressKey();
		
		//second battle
		GrindlewaldBattle grindlewaldBattle = new GrindlewaldBattle(subjects, 75, pl, clock);
		grindlewaldBattle.fight();
		
		GameLogic.printHeading("Congrats, you've levelled up and unlocked new skill upgrades!");
		GameLogic.implicitPressKey();
		GameLogic.pl.assignSkills();
		
		printOutro();
	}

	@Override
	public void printOutro() {
		// TODO Auto-generated method stub
		System.out.println("After an intense and exhausting battle, " + name + " and his allies finally emerged victorious. Grindelwald was captured and brought to justice.");
		GameLogic.pressKey();
		System.out.println("Newt Scammander: It is thanks to all of our bravery and determination that we were able to defeat Grindelwald and his followers.");
		GameLogic.implicitPressKey();
		System.out.println("Young Dumbledore: We must continue to fight against the darkness, always.");
		GameLogic.implicitPressKey();
		System.out.println(name + ": I couldn't have done this without all of you. Thank you. Now, I need to try and get back to my time!");
		GameLogic.pressKey();
		
		GameLogic.brewPotion("Wolf Elixir");
	}
	
	

}
