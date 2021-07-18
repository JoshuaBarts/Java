public interface Stack {
	public void push(Object data);
	public Object pop() throws EmptyCollectionException;
	public Object peek() throws EmptyCollectionException;
	public boolean isEmpty();
}