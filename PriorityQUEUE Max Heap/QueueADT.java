public interface QueueADT {
	public void enqueue(Object data, int priority);
	public Object dequeue();
	public int size();
}