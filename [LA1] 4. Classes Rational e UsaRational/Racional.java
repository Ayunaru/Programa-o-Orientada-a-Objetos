public class Racional {

    private int numerador;
    private int denominador;

    public Racional() 
    {
        numerador = 1;
        denominador = 1;
    }

    public Racional(int numerador, int denominador) 
    {
        this.numerador = numerador;
        this.denominador = denominador;
        
        simplificar();
    }

    private void simplificar() 
    {
        int mdc = calcMDC(numerador, denominador);

        numerador = numerador / mdc;
        denominador = denominador / mdc;
    }

    private int calcMDC(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;

            b = a % b;
            a = temp;
        }
        
        return a;
    }

    public Racional soma(Racional otr) 
    {
        int novonumerador = (numerador * otr.denominador) + (otr.numerador * denominador);
        int novodenominador = denominador * otr.denominador;

        return new Racional(novonumerador, novodenominador);
    }

    public Racional subt(Racional otr) 
    {
        int novonumerador = (numerador * otr.denominador) - (otr.numerador * denominador);
        int novodenominador = denominador * otr.denominador;

        return new Racional(novonumerador, novodenominador);
    }

    public Racional mult(Racional otr) 
    {
        int novonumerador = numerador * otr.numerador;
        int novodenominador = denominador * otr.denominador;

        return new Racional(novonumerador, novodenominador);
    }

    public Racional dividir(Racional otr) 
    {
        int novonumerador = numerador * otr.denominador;
        int novodenominador = denominador * otr.numerador;
        
        return new Racional(novonumerador, novodenominador);
    }

    public String frac() 
    {
        return numerador + "/" + denominador;
    }

    public String decimal() 
    {
        return String.valueOf((double) numerador / denominador);
    }
}
