package atlantic2.transaction.controller.exceptions;

public class MamanDOracleException extends RuntimeException {

    public static final String WESH_ALORS = "On ne nique pas la maman d'Oracle";

    public MamanDOracleException(String message) {
        super(message);
    }
}
