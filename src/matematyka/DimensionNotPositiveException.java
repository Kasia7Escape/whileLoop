package matematyka;

//nazwa - exception - dobre praktyki
public class DimensionNotPositiveException extends RuntimeException {
    private String message;

    public DimensionNotPositiveException(String message){
        super(message);  //
        this.message = message;
    }

}
