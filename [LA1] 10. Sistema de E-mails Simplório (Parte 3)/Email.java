package Em;
public class Email 
{
    private String de, para, assunto, mensagem;
    private Data data;
    private Anexo[] anexos;
    private int qtdAnexos = 0;

    public Email(String de, String para, String assunto, String mensagem, Data data, Anexo[] anexos) 
    {
        this.de = de;
        this.para = para;
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.data = data;
        this.anexos = anexos;
        this.qtdAnexos = anexos != null ? anexos.length : 0;
    }

    public String getPara() 
    {
        return para;
    }

    public String getAssunto() 
    {
        return assunto;
    }

    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("De: ").append(de)
          .append("\nPara: ").append(para)
          .append("\nAssunto: ").append(assunto)
          .append("\nData: ").append(data)
          .append("\nMensagem: ").append(mensagem)
          .append("\nAnexos: ");
        
        if (qtdAnexos > 0) 
        {
            for (Anexo anexo : anexos) 
            {
                sb.append("\n- ").append(anexo);
            }
        } 
        else 
        {
            sb.append("sem anexos");
        }

        return sb.toString();
    }
}
