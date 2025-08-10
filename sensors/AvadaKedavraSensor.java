import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AvadaKedavraSensor extends Sensor {

	
	AvadaKedavraSensor(String host, int port) {
		super(host, port);
		// TODO Auto-generated constructor stub
	}

	public void run() {
	try {
		
		Socket socket = new Socket(this.host, this.port);
		InputStream input = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(input);

		BufferedReader br = new BufferedReader(reader);
		String line = "";
		while ((line = br.readLine()) != null) {
			
			JSONObject jsonObject = (JSONObject) parser.parse(line);
			
			String acc = (String) jsonObject.get("gyroRotationX");
			
			double a = Double.parseDouble(acc);
			if(a>5 || a<-5)
			{
				
				readSensor(" ☠️☠️☠️ You performed Avada Kedavra");
				
				break;
			}
			
		}
		
	} catch (UnknownHostException ex) {
		System.out.println("Server not found: " + ex.getMessage());
	} catch (IOException ex) {
		System.out.println("I/O error: " + ex.getMessage());
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}

