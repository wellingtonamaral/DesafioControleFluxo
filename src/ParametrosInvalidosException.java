public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(String errorMessage) {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

}