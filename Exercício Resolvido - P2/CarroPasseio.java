public class CarroPasseio extends VeiculoHibrido {
    
    public CarroPasseio(int num) 
    {
        super(num, 4, 2.0f, Math.random() < 0.5 ? "gas" : "energia");
    }
    
    @Override
    public String printa() 
    {
        String pTraseiros = this.rodas[2].isPneuBom() ? "c" : "x";
        String estrelas = "*".repeat(TotalDistancia / 10);
        return "    ___ \n __/ |\\_\n| " + pTraseiros + " _     _``-.\n'( )---( )--'\n" + estrelas;
    }

    @Override
    public void mover() 
    {
        if (movimenta()) 
        {
            TotalDistancia += 40;
        }
    }
}