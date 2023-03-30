//вводим exeption
public class DeathError extends RuntimeException {
    String message;
    DeathError(String message){
        super(message);
    }
}
