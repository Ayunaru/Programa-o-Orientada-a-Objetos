public class Motocicleta extends VeiculoHibrido 
{
    public Motocicleta (int num) 
    {
        super(num, 2, 1.5f, Math.random() < 0.5 ? "gas" : "energia");
    }
    
    @Override
    public void mover() 
    {
        if (movimenta()) 
        {
            TotalDistancia += 40;
        }
    }

    @Override
    public String printa() 
    {
        String pneus = movimenta() ? "c" : "x";
        String estrelas = "*".repeat(TotalDistancia / 10);
        return "   ,_oo\n.-/" + pneus + "-//::   \n( )'==( )\n" + estrelas;
    }
}