package clases;

import exeptions.NumeroInvalidoDeLados;

import static java.lang.Math.sqrt;

public class PoligonoRegular extends Figura {

    int numeroDeLados;
    double lado;
    double perimetro=0;
    double apotema=0;


    public PoligonoRegular(int numeroDeLados, double lado) {
        this.lado=lado;
        this.numeroDeLados=numeroDeLados;

        super.SetName("Poligono Regular");

    }
    public PoligonoRegular(int numeroDeLados) throws NumeroInvalidoDeLados {

        if(numeroDeLados<5)
        {
            throw new NumeroInvalidoDeLados();
        }
        this.numeroDeLados = numeroDeLados;

        super.SetName("Poligono Regular");


    }

    public double getArea() {

        perimetro=CalculaPerimetro();
        apotema=CalculaApotema();

        return ((perimetro*apotema)/2);

    }

    public double getLado() {
        return lado;
    }
    private double CalculaPerimetro()
    {
        double perim;
        perim=lado*numeroDeLados;
        return perim;
    }
    private double CalculaApotema()
    {
        double perim;

        perim=sqrt(-((lado/2)*(lado/2))+(lado*lado));

        return perim;
    }

    public void setLado(double lado) {
        this.lado=lado;
    }
}
