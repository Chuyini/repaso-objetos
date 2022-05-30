package clases;

import exeptions.LadoNoProvistoException;

public class Cuadrado extends Figura {
    private double lado=0;
    private double area;
    String name="Cuadrado";
    public Cuadrado(double lado)
    {
        this.lado=lado;
        CalculaArea();
        super.SetName(name);
    }
    public Cuadrado()
    {

        super.SetName(name);
    }
    public void setLado(double lado) {
        this.lado=lado;
        CalculaArea();

    }

    public double getArea() throws LadoNoProvistoException {
        if(lado==0)
        {
            throw new LadoNoProvistoException();
        }
        return area;
    }

    private double CalculaArea()
    {
        area=lado*lado;
        return area;
    }



    public double getLado() {
        return lado;
    }
}
