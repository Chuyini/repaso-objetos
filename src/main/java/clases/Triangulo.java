package clases;

import exeptions.AlturaNoProvistaException;
import exeptions.BaseNoProvistaException;

public class Triangulo extends Figura {
    double base=0;
    double altura;
    String descrpicion="Cualquier triangulo";

    public Triangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
        super.SetName("Triangulo");
    }
    public Triangulo() {
        this.base=0;
        this.altura=0;
        super.SetName("Triangulo");
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }

    public void setBase(double base) {
        this.base=base;
    }

    public double getArea() throws BaseNoProvistaException, AlturaNoProvistaException
    {


        if(base==0)
        {
            throw new BaseNoProvistaException();
        }
        if(altura==0)
        {
            throw new AlturaNoProvistaException();
        }

        return CalculaArea();
    }
    private double CalculaArea()

    {
       double area = 0;
        area=(base*altura)/2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {

        return altura;
    }

    public String getDescription() {

        return descrpicion;
    }
}
