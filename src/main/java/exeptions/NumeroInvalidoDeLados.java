package exeptions;

public class NumeroInvalidoDeLados extends RuntimeException{
    public NumeroInvalidoDeLados()
    {
        super("Número de lados válido a partir de 5");
    }
}
