public class CarroEsportivo extends VeiculoHibrido {
    public CarroEsportivo(int num) 
    {
        super(num, 4, 2.5f, Math.random() < 0.5 ? "gas" : "energia");
    }
    
    @Override
    public String printa() 
    {
        String pDianteiros = this.rodas[0].isPneuBom() ? "c" : "x";

        String estrelas = "*".repeat(TotalDistancia / 10);
        return "               _______\n            _/\\______\\__\n          / ,-." + pDianteiros + "-|-  ,-.`-.\n            `( )----( )-'\n" + estrelas;
    }

    @Override
    public void mover() 
    {
        if (movimenta()) 
        {
            TotalDistancia += 50;
        }
    }
}