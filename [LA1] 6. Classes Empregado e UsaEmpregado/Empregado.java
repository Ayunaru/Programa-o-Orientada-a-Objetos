public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;

        setsalario(salario);
    }

    public String getnome() 
    {
        return nome;
    }

    public void setnome(String nome) 
    {
        this.nome = nome;
    }

    public String getSobrenome() 
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }

    public double getsalario() 
    {
        return salario;
    }

    public void setsalario(double salario) 
    {
        if (salario > 0) 
        {
            this.salario = salario;
        } 
        
        else 
        {
            this.salario = 0;
        }
    }

    public double getanual() 
    {
        return salario * 12;
    }

    public void aumento() 
    {
        salario = salario * 1.1;
    }
}
