

public class AvadaKedavra implements Command{
	
	@Override
	public int execute() {
		// TODO Auto-generated method stub
        System.out.println("Quick! Rotate your phone to peform the killing curse!");
        //Sensor implementation - gyroscope
        
        new AvadaKedavraSensor("192.168.193.120", 2000);
        
 		return 100;
	}
	

}
