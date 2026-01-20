public class motor 
{
    private String tipo;
    private boolean ligado;
    private double pot;

    public motor(String tipo) 
    {
        this.tipo = tipo;
        this.ligado = false;
        this.pot = 0;
    }

    public void ligar() 
    {
        this.ligado = true;
        this.pot = 10;
    }

    public void desligar() 
    {
        this.ligado = false;
        this.pot = 0;
    }

    public void setPotencia(double pot) 
    {
        if (ligado) 
        {
            this.pot = pot;
        }
    }

    public double getPotencia() 
    {
        return pot;
    }

    public boolean taOn() 
    {
        return ligado;
    }

    public String getTipo() 
    {
        return tipo;
    }
}