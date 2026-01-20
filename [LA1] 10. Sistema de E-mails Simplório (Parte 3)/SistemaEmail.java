package Em;
import java.util.Scanner;

public class SistemaEmail 
{
    private static CaixaEmail caixaEmail = new CaixaEmail();
    private static String usuarioLogado = null;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do 
        {
            System.out.println("\n Menu");
            System.out.println("1. Fazer Login");
            System.out.println("2. Escrever email");
            System.out.println("3. Listar emails");
            System.out.println("4. Ler email");
            System.out.println("5. Excluir email");
            System.out.println("6. Fazer Logout");
            System.out.println("7. Sair");
            System.out.print("Escolha uma op: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) 
            {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    escreverEmail(scanner);
                    break;
                case 3:
                    listarEmails();
                    break;
                case 4:
                    lerEmail(scanner);
                    break;
                case 5:
                    excluirEmail(scanner);
                    break;
                case 6:
                    logout();
                    break;
                case 7:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("op invalida");
            }
        } 
        while (opcao != 7);

        scanner.close();
    }

    private static void login(Scanner scanner) 
    {
        System.out.print("Digite seu nome de usuario: ");
        usuarioLogado = scanner.nextLine();
        System.out.println("login efetuado como: " + usuarioLogado);
    }

    private static void escreverEmail(Scanner scanner) 
    {
        if (usuarioLogado == null) 
        {
            System.out.println("faca login primeiro");
            return;
        }

        System.out.print("Para: ");
        String para = scanner.nextLine();

        System.out.print("Assunto: ");
        String assunto = scanner.nextLine();

        System.out.print("Mensagem: ");
        String mensagem = scanner.nextLine();

        System.out.print("Dia: ");
        int dia = scanner.nextInt();

        System.out.print("Mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        scanner.nextLine(); 

        Data data = new Data(dia, mes, ano);
        Anexo[] anexos = new Anexo[0];
        
        caixaEmail.escreveEmail(new Email(usuarioLogado, para, assunto, mensagem, data, anexos));
    }

    private static void listarEmails() 
    {
        if (usuarioLogado == null) 
        {
            System.out.println("faca login primeiro");
        } 
        
        else 
        {
            caixaEmail.listarEmails(usuarioLogado);
        }
    }

    private static void lerEmail(Scanner scanner) 
    {
        System.out.print("Digite o num do email para ler: ");
        int index = scanner.nextInt();
        caixaEmail.lerEmail(index);
    }

    private static void excluirEmail(Scanner scanner) 
    {
        System.out.print("Digite o num do email para excluir: ");
        int index = scanner.nextInt();
        caixaEmail.excluirEmail(index);
    }

    private static void logout() 
    {
        usuarioLogado = null;
        System.out.println("logout realizado com sucesso");
    }
}
