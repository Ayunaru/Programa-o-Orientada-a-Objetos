public class TestEmpregado
{
    public static void main(String[] args) 
    {

        Empregado x = new Empregado("Nome", "Sobrenome", 100);

        System.out.println("Nome: " + x.getnome() + " " + x.getSobrenome());
        System.out.println("Salario Mensal: " + x.getsalario());
        System.out.println("Anual: " + x.getanual());

        x.aumento();

        System.out.println("Aumento 10% sobre mensal: " + x.getsalario());

    }
}