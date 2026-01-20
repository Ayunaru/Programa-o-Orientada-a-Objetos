public class Complexo 
{
    int real;
    int imaginario;

    public Complexo(int real, int imaginario) 
    {
        this.real = 2;
        this.imaginario = 1;
    }

    void iniciar(int real, int imaginario) 
    {
        this.real = real;
        this.imaginario = imaginario;
    }

    void imprimir() 
    {
        System.out.println(this.real + "+" + this.imaginario + "i");
    }

    boolean eIgual(Complexo outro) 
    {
        return this.real == outro.real && this.imaginario == outro.imaginario;
    }

    Complexo soma(Complexo outro) 
    {
        int novaParteReal = this.real + outro.real;
        int novaParteimaginario = this.imaginario + outro.imaginario;
        
        return new Complexo(novaParteReal, novaParteimaginario);
    }

    Complexo subtrai(Complexo outro) 
    {
        int novaParteReal = this.real - outro.real;
        int novaParteimaginario = this.imaginario - outro.imaginario;

        return new Complexo(novaParteReal, novaParteimaginario);
    }

    Complexo multiplica(Complexo outro) 
    {
        int novaParteReal = (this.real * outro.real) - (this.imaginario * outro.imaginario);
        int novaParteimaginario = (this.real * outro.imaginario) + (this.imaginario * outro.real);

        return new Complexo(novaParteReal, novaParteimaginario);
    }

    Complexo divide(Complexo outro) 
    {
        int denominador = (outro.real * outro.real) + (outro.imaginario * outro.imaginario);
        int novaParteReal = ((this.real * outro.real) + (this.imaginario * outro.imaginario)) / denominador;
        int novaParteimaginario = ((this.imaginario * outro.real) - (this.real * outro.imaginario)) / denominador;

        return new Complexo(novaParteReal, novaParteimaginario);
    }
}