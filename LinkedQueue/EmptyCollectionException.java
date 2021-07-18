public class EmptyCollectionException extends RuntimeException {
   protected static final long serialVersionUID = 42L;
    
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}
