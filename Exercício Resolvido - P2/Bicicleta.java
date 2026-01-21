public class Bicicleta extends Veiculo {
    
    public Bicicleta (int num) 
    {
        super(num, 2);
    }
    
    @Override
    public String printa() 
    {
        String estrelas = "*".repeat(TotalDistancia / 10);
        if (movimenta()) 
        {
            return "  __o    \n _`\\<,_ \n(*)/ (*)\n" + estrelas;

        } 
        
        else 
        {
            return "  __x    \n _`\\<,_ \n(*)/ (*)\n" + estrelas;
        }
    }

    @Override
    public void mover() 
    {
        if (movimenta()) 
        {
            TotalDistancia += 10;
        }
    }
}