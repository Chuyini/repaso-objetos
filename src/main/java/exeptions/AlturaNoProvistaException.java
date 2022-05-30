package exeptions;

public class AlturaNoProvistaException extends DatoFaltanteException{
    public AlturaNoProvistaException()
    {
        super("Altura no provista");
    }
}
