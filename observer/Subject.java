

public interface Subject {
	public void publishMessage(Message m);
	public void registerObserver(Observer o);
	public void removeObsever(Observer o);
}
