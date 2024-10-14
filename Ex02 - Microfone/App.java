public class App {
    public static void main(String[] args) 
    {
        Microfone m1 = new Microfone();

        m1.marca = "Toshiba";
        m1.led = false;
        m1.cor = "preto";
        m1.custo = 120.0f;
        m1.ligado = false;
        m1.mutado = true;
        m1.falar();
       
        //m1.status();
        System.out.println("0");
        m1.ligar();
        m1.desmutar();
        m1.trocacor();
        m1.falar();
        m1.status();

    }
}