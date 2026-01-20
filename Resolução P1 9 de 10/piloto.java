public class piloto 
{
    private String nome;

    public piloto(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }

    public static void main(String[] args) 
    {
        piloto p1 = new piloto("P1");
        piloto p2 = new piloto("P3");
        piloto p3 = new piloto("P4");

        aviao a1 = new aviao(1, "hélice", 3000, 1, 10, p1);
        aviao a2 = new aviao(2, "hélice", 5000, 2, 20, p2);
        aviao a3 = new aviao(4, "turbina", 70000, 3, 30, p3);

        a1.ligar();
        a1.aumentaVel(10);
        a1.direcionar("cima", 3);
        
        a2.ligar();
        a2.aumentaVel(20);
        a2.direcionar("direita", 2);

        a3.ligar();
        a3.aumentaVel(10);
        a3.direcionar("esquerda", 1);

        System.out.println("vel aviao1: " + a1.getVel());
        System.out.println("vel aviao2: " + a2.getVel());
        System.out.println("vel aviao3: " + a3.getVel());
        
    }
}