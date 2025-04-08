public class NegativePriceException extends RuntimeException {
    public NegativePriceException(){
        super("Price is not valid");
    }
}
