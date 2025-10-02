public class InsufficientBalanceException extends OrderException{
    public InsufficientBalanceException() {}

    public InsufficientBalanceException(String message){
        super(message);
    }

}
