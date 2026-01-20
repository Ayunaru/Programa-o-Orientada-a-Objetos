import java.util.Scanner;

public class FrequenciaCardiaca 
{
    private String primeiroNome;
    private String sobrenome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    public FrequenciaCardiaca(String primeiroNome, String sobrenome, int diaNasc, int mesNasc, int anoNasc) 
    {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    public void setPrimeiroNome(String primeiroNome) 
    {
        this.primeiroNome = primeiroNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setDiaNasc(int diaNasc)
    {
        this.diaNasc = diaNasc;
    }

    public int getDiaNasc()
    {
        return diaNasc;
    }

    public void setMesNasc(int mesNasc)
    {
        this.mesNasc = mesNasc;
    }

    public int getMesNasc()
    {
        return mesNasc;
    }

    public void setAnoNasc(int anoNasc)
    {
        this.anoNasc = anoNasc;
    }

    public int getAnoNasc()
    {
        return anoNasc;
    }

    public int obterIdade() 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dia hoje: ");
        int diaAgr = scanner.nextInt();
        System.out.println("Mes hj: ");
        int mesAgr = scanner.nextInt();
        System.out.println("Ano hj: ");
        int anoAgr = scanner.nextInt();

        int idade = anoAgr - anoNasc;
        
        if (mesAgr < mesNasc || (mesAgr == mesNasc && diaAgr < diaNasc)) 
        {
            idade--;
        }
        
        return idade;
    }

    public int obterFreqMax() 
    {
        return 220 - obterIdade();
    }

    public String obterFredIdeal()
    {
        int freqMax = obterFreqMax();
        int minIdeal = (int) (freqMax * 0.50);
        int maxIdeal = (int) (freqMax * 0.85);
        return minIdeal + " - " + maxIdeal + " bpm";
    }
}
