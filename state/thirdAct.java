

public class thirdAct extends Act implements State{
	
	public thirdAct(Player p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void next(Context context) {
		// TODO Auto-generated method stub
		context.ended = 1;
		GameLogic.isRunning = false;
	}

	@Override
	public void printIntro() {
		// TODO Auto-generated method stub
		GameLogic.clearConsole();
		GameLogic.printHeading("The Final Battle");
		System.out.println("After years of fighting and sacrifices, " + name + " and their allies finally face off against Voldemort and the Death Eaters.");
		GameLogic.pressKey();
		System.out.println(name + ": This is it, we have to end this once and for all.");
		GameLogic.implicitPressKey();
		System.out.println("Harry: Let's do this. We have to protect Hogwarts and everyone we love.");
		GameLogic.implicitPressKey();
		System.out.println("Ron: We're with you, Harry.");
		GameLogic.implicitPressKey();
		System.out.println("Hermione: Always.");
		GameLogic.implicitPressKey();
		System.out.println("As they approach the battlefield, the tension in the air is palpable. The fate of the wizarding world rests on their shoulders.\n\n");
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
		
		//last battle
		FinalBattle finalBattle = new FinalBattle(subjects, 45, pl, clock);
		finalBattle.fight();

		printOutro();
	}

	@Override
	public void printOutro() {
		// TODO Auto-generated method stub
		GameLogic.clearConsole();
		GameLogic.printHeading("The End");
		System.out.println(name + " and their allies emerge victorious, finally putting an end to Voldemort's reign of terror.");
		GameLogic.pressKey();
		System.out.println("Harry: It's over. We did it.");
		GameLogic.implicitPressKey();
		System.out.println("Ron: It's been an honor fighting by your side.");
		GameLogic.implicitPressKey();
		System.out.println("Hermione: We couldn't have done it without you. Here's the Time Turner...use this to get back to your timeline!");
		GameLogic.implicitPressKey();
		GameLogic.clearConsole();
		System.out.println("You've acquired: Time turner!\n");
		System.out.println("    _____\r\n"
				+ "     _.'_____`._\r\n"
				+ "   .'.-'  12 `-.`.\r\n"
				+ "  /,' 11      1 `.\\\r\n"
				+ " // 10      /   2 \\\\\r\n"
				+ ";;         /       ::\r\n"
				+ "|| 9  ----O      3 ||\r\n"
				+ "::                 ;;\r\n"
				+ " \\\\ 8           4 //\r\n"
				+ "  \\`. 7       5 ,'/\r\n"
				+ "   '.`-.__6__.-'.'\r\n"
				+ "    ((-._____.-))\r\n"
				+ "    _))       ((_\r\n"
				+ "   '--'        '--'");
		GameLogic.implicitPressKey();
		GameLogic.clearConsole();
		System.out.println("As they look around, they see the aftermath of the battle - the wounded, the fallen, and the destruction left in its wake.");
		GameLogic.pressKey();
		System.out.println("But amidst the devastation, there is also hope. The wizarding world can finally start to heal and rebuild.");
		GameLogic.implicitPressKey();
		System.out.println("And for " + name + " and their friends, there is a new chapter waiting to be written - one filled with new adventures and possibilities. They wave goodbye and return to their time...");
		GameLogic.pressKey();
	
	}
	
	
}
