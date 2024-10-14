import java.util.Scanner;
public class Microfone {

    String marca;
    Boolean led;
    String cor;
    Float custo;
    Boolean ligado;
    Boolean mutado;

    void ligar(){

        this.ligado = true;

    }

    void desligar(){

        this.ligado = false;

    }

    void falar(){

        if (this.ligado == true && mutado == false) {
            System.out.println("Falando...");
            
        }
        else{
            System.out.println("Microfone mutado ou desligado");
        }

    }

    void mutar(){
        this.mutado = true;

    }

    void desmutar(){
        this.mutado = false;

    }

    void trocacor()
    {
        this.cor = "rosa";
    }

    void status()
    {
        System.out.println("Marca: "+this.marca);
        System.out.println("Tem led? "+this.led);
        System.out.println("Qual a cor? "+this.cor);
        System.out.println("Qual o custo? "+this.custo);
        System.out.println("Está ligado? "+this.ligado);
        System.out.println("Esta mutado? "+this.mutado);
    }

}
