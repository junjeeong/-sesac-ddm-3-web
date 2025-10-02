public class OutOfStockException extends OrderException{
    public OutOfStockException() {}

    public OutOfStockException(String message){
        super(message);
    }
}
