package exeptions;

public class LadoNoProvistoException extends DatoFaltanteException {
    public LadoNoProvistoException()
    {
        super("Lado no provisto");
    }

}
