public abstract class Veiculo implements Desenhavel, Calibravel {
    protected int num;
    protected int TotalDistancia;
    protected Roda[] rodas;
    
    public Veiculo(int num, int qtdRodas) 
    {
        this.num = num;
        this.TotalDistancia = 0;
        this.rodas = new Roda[qtdRodas];
        
        for (int i = 0; i < qtdRodas; i++)
        {
            this.rodas[i] = new Roda();
        }
        
    }
    
    @Override
    public void enchePneu(int qtdPneu) 
    {
        if (qtdPneu >= 0 && qtdPneu < rodas.length){
            rodas[qtdPneu].setCalibragem(true);
        }
    }

    public abstract void mover();
    
    @Override
    public void enchePneu() 
    {
        for(Roda roda : rodas){
            roda.setCalibragem(true);
        }
    }

    public boolean movimenta() 
    {
        for (Roda roda : rodas) 
        {
            if (!roda.isPneuBom()) {
                return false;
            }
        }
        return true;
    }
    
    public void setTotalDistancia(int TotalDistancia) 
    {
        this.TotalDistancia = TotalDistancia;
    }

    public Roda[] getRodas() 
    {
        return rodas;
    }
    
    public int getNum() 
    {
        return num;
    }

    public void setNum(int num) 
    {
        this.num = num;
    }

    public int getTotalDistancia() 
    {
        return TotalDistancia;
    }

    public void setRodas(Roda[] rodas) 
    {
        this.rodas = rodas;
    }

    @Override
    public String toString() 
    {
        return "Veiculo [num = " + num + ", TotalDistancia = " + TotalDistancia + "]";
    }
}