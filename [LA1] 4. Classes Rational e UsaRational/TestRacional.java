public class TestRacional {
    public static void main(String[] args) 
    {
  
        Racional r1 = new Racional(3, 4);  // 3/4
        Racional r2 = new Racional(2, 5);  // 2/5

        Racional soma = r1.soma(r2);
        System.out.println("Soma: " + soma.frac() + " ou " + soma.decimal());

        Racional subtracao = r1.subt(r2);
        System.out.println("Sub: " + subtracao.frac() + " ou " + subtracao.decimal());

        Racional multiplicacao = r1.mult(r2);
        System.out.println("Mult: " + multiplicacao.frac() + " ou " + multiplicacao.decimal());

        Racional divisao = r1.dividir(r2);
        System.out.println("Divisao: " + divisao.frac() + " ou " + divisao.decimal());
        
    }
}
