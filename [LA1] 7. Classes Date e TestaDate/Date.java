public class Date {

    int dia, mes, ano;

    public Date(int dia, int mes, int ano) 
    {
        this.dia = dia;
        this.ano = ano;

        if (mes > 12 || mes < 1) 
        {
            this.mes=1;
        }
        else
        {
            this.mes = mes;
        }

    }
    
    public int getdia() 
    {
        return dia;
    }

    public int getmes() 
    {
        return mes;
    }

    public int getano() 
    {
        return ano;
    }

    public void setdia(int dia) 
    {
        this.dia = dia;
    }

    public void setmes(int mes) 
    {
        this.mes = mes;

        if (mes > 12 || mes < 1) 
        {
            this.mes=1;
        }
        else
        {
            this.mes = mes;
        }
    }

    public void setano(int ano) 
    {
        this.ano = ano;
    }

    public void mostraData()
    {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

}
