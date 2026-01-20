import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String primeiroNome = scanner.nextLine();

        System.out.println("Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Dia nasc: ");
        int diaNasc = scanner.nextInt();

        System.out.println("Mes nasc: ");
        int mesNasc = scanner.nextInt();

        System.out.println("Ano nasc: ");
        int anoNasc = scanner.nextInt();

        FrequenciaCardiaca pessoa = new FrequenciaCardiaca(primeiroNome, sobrenome, diaNasc, mesNasc, anoNasc);

        System.out.println("\nInfo Paciente:");
        System.out.println("Nome: " + pessoa.getPrimeiroNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de Nasc: " + pessoa.getDiaNasc() + "/" + pessoa.getMesNasc() + "/" + pessoa.getAnoNasc());

        int idade = pessoa.obterIdade();
        System.out.println("Idade: " + idade);

        int freqMax = pessoa.obterFreqMax();
        System.out.println("Freq Max: " + freqMax);

        String freqIdeal = pessoa.obterFredIdeal();
        System.out.println("Freq Ideal: " + freqIdeal);
    }
}
