package Em;

public class Anexo {
    private String nome;
    private byte[] conteudo;

    public Anexo(String nome, byte[] conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public byte[] getConteudo() {
        return conteudo;
    }
}
