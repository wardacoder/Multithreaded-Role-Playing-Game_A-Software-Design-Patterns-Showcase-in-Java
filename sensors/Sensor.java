import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.json.simple.parser.JSONParser;

public abstract class Sensor implements Runnable{

	String host;
	int port;
	JSONParser parser;
	
	Sensor(String host, int port){
		this.host = host;
		this.port = port;
		Thread t = new Thread(this);
		this.parser = new JSONParser();
		t.start();
	}
	
	public synchronized void readSensor(String message) {
		System.out.println(message);
	}
	
}
