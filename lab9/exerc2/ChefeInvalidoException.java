public class ChefeInvalidoException extends Exception {
    public ChefeInvalidoException() {
        super("Chefe inválido! Um funcionário não pode ser chefe de si mesmo.");
    }    
    /* 
    public String getMessage() {
        return "Chefe Inválido!";
    }
    */
}
