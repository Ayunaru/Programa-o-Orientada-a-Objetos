public class Roda {
    private boolean calibragem;
    
    public Roda() {
        this.calibragem = Math.random() < 0.3;
    }

    public boolean isPneuBom() {
        return calibragem;
    }
    
    public void setCalibragem(boolean calibragem) 
    {
        this.calibragem = calibragem;
    }

    @Override
    public String toString() 
    {
        return calibragem ? "calibrada" : "descalibrada";
    }

    public boolean getCalibragem() {
        return calibragem;
    }

}