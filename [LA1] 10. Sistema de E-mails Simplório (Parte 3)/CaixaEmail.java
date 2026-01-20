package Em;
public class CaixaEmail 
{
    private Email[] emails;
    private int qtdEmails;

    public CaixaEmail() 
    {
        emails = new Email[10];
        qtdEmails = 0;
    }

    public void escreveEmail(Email email) 
    {
        if (qtdEmails < emails.length) 
        {
            emails[qtdEmails++] = email;
            System.out.println("email enviado com sucesso");
        } 

        else 
        {
            System.out.println("caixa de email cheia");
        }
    }

    public void listarEmails(String usuario) 
    {
        System.out.println("emails destinados a " + usuario + ":");

        for (int i = 0; i < qtdEmails; i++) 
        {
            if (emails[i].getPara().equals(usuario)) 
            {
                System.out.println(i + ": " + emails[i].getAssunto());
            }
        }
    }

    public void lerEmail(int index) 
    {
        if (index >= 0 && index < qtdEmails) 
        {
            System.out.println(emails[index]);
        } 

        else 
        {
            System.out.println("email n encontrado");
        }
    }

    public void excluirEmail(int index) 
    {
        if (index >= 0 && index < qtdEmails) 
        {
            emails[index] = null;
            System.arraycopy(emails, index + 1, emails, index, qtdEmails - index - 1);
            qtdEmails--;
            System.out.println("email excluido");
        } 
        
        else 
        {
            System.out.println("email n encontrado");
        }
    }
}
