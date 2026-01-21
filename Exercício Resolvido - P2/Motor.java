public class Motor {
    private int Rota;
    private float cilin;
    private String mode;

    public static final float gastoCombust = 0.001f;
    public static final float gastoEnergia = 0.0001f;

    public Motor(float cilin, String mode) 
    {
        this.cilin = cilin;
        this.mode = mode;
        this.Rota = 0;
    }

    public String getMode() 
    {
        return mode;
    }

    public void acelera(int intensidade) 
    {
        this.Rota += intensidade;
    }

    public float getCilin() 
    {
        return cilin;
    }

    public int getRota() 
    {
        return Rota;
    }

    @Override
    public String toString() 
    {
        return "Motor [mode=" + mode + ", Rota=" + Rota + ", cilin=" + cilin + "]";
    }
}