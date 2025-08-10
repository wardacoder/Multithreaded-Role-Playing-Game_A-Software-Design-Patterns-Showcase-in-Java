

public class Message {
	String origin;
	String topic;
	int payload;
	
	Message(String origin, String topic, int payload){
		this.origin=origin;
		this.topic=topic;
		this.payload=payload;
	}
	
	public String toString() {
		return "origin:"+origin+"\ntopic:"+topic+"\npayload:"+payload;
	}
}
