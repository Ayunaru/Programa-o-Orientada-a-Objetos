public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar (){

        if (this.tampada==true || this.carga <= 0) 
        {
            System.out.println("ERRO! caneta tampada ou falta carga");
        }
        else
        {
            System.out.println("Rabiscando...");
        }


    }

    void tampar(){

        this.tampada = true;

    }

    void destampar(){

        this.tampada = false;

    }

    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor da caneta: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga (100-0): "+this.carga);
        System.out.println("A caneta tampada? "+this.tampada);

    }
}
