public class Fatura 
{
    private String numPeca;
    private String descricao;
    private int qtd;
    private double precoItem;

    public Fatura(String numPeca, String descricao, int qtd, double precoItem) 
    {
        this.numPeca = numPeca;
        this.descricao = descricao;
        
        setqtd(qtd); 
        setprecoItem(precoItem); 
    }

    public String getnumPeca() 
    {
        return numPeca;
    }

    public void setnumPeca(String numPeca) 
    {
        this.numPeca = numPeca;
    }

    public String getdescricao() 
    {
        return descricao;
    }

    public void setdescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public int getqtd() 
    {
        return qtd;
    }

    public void setqtd(int qtd) 
    {
        if (qtd > 0) 
        {
            this.qtd = qtd;
        } 
        
        else 
        {
            this.qtd = 0;
        }
    }

    public double getprecoItem() 
    {
        return precoItem;
    }

    public void setprecoItem(double precoItem) 
    {

        if (precoItem > 0) 
        {
            this.precoItem = precoItem;
        }

        else 
        {
            this.precoItem = 0;
        }
    }

    public double obterTotal() 
    {
        return qtd * precoItem;
    }
}
