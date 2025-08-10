


public class Clock extends ConcreteSubject implements Runnable {

	int seconds;
	int done = 0;
	Thread t;
	
	Clock() {
		t = new Thread(this);
	}

	public void run() {

		while (done==0) {
			
			try {
				Thread.sleep(1*1000);
				seconds++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String origin = "\u23F0";
			String topic = "timing update";
			int payload =  seconds;
			
			
			Message m = new Message(origin, topic, payload); 
			publishMessage(m);

		}
	}
	
	

}
