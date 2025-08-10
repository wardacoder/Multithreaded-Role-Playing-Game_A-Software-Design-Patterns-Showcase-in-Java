

public class Lumos implements Command{


	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Say Lumos into your microphone to light up your surroundings");
		//Sensor implementation
		new LumosSensor("192.168.193.120", 2000);
		
		return 0;
	}

}
