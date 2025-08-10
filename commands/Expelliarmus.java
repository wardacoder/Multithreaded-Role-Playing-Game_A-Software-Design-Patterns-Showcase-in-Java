

public class Expelliarmus implements Command{
	
	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Quick! Wave you phone left and right!");
		// Sensor implementation
		
		new ExpelliarmusSensor("192.168.193.120", 2000);
		
		return 5;
	}
}
