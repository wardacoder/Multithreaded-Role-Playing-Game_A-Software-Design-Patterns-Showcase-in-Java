

public class firstAct extends Act implements State{

	public firstAct(Player p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		context.setState(new secondAct(pl));
	}

	@Override
	public void printIntro() {
		// TODO Auto-generated method stub
		GameLogic.clearConsole();
		GameLogic.printHeading("The Slytherin Battle");
		System.out.println(pl.name + " and "
				+ "The Hogwarts founders have found themselves in a precarious situation. The Great Hall is filled with tension as the air crackles with magic and the clash of swords. "
				+ "Salazar Slytherin and his followers are challenging them, and it's up to our heroes to defend the honor and integrity of their beloved school.");
		GameLogic.pressKey();
		System.out.println("Godrick Gryffindor: We can't let Salazar and his followers win this! Fight with all your might!");
		GameLogic.implicitPressKey();
		System.out.println("Salazar Slytherin: We will not rest until we have established our rightful place in this school!");
		GameLogic.implicitPressKey();
		System.out.println("Rowena Ravenclaw: Stick together and protect each other!");
		GameLogic.implicitPressKey();
		System.out.println("Helga Hufflepuff: Don't forget the values of friendship and loyalty that we stand for!\n\n");
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
		
		//first battle
		SlytherinBattle slytherinBattle = new SlytherinBattle(subjects, 100, pl, clock);
		slytherinBattle.fight();
		
		GameLogic.printHeading("Congrats, you've levelled up and unlocked new skill upgrades!");
		GameLogic.implicitPressKey();
		GameLogic.pl.assignSkills();
		
		
		printOutro();
	}

	@Override
	public void printOutro() {
		// TODO Auto-generated method stub
		System.out.println("After a long and grueling battle, " + pl.name + " and the founders emerged victorious. Salazar Slytherin was banished from Hogwarts and the school remained a safe and welcoming place for all students.");
		GameLogic.pressKey();
		System.out.println("Godrick Gryffindor: We could not have won without each other's help. Thank you all.");
		GameLogic.implicitPressKey();
		System.out.println("Rowena Ravenclaw: Let's ensure that we continue to protect the values of our school, always.");
		GameLogic.implicitPressKey();
		System.out.println("Helga Hufflepuff: And remember, there is strength in unity!");
		GameLogic.pressKey();
		
		GameLogic.brewPotion("Snake Skin");
	}

}
