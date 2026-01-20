public class App{
    public static void main(String[] args) 
    {

        Complexo num1 = new Complexo(0, 0);
        Complexo num2 = new Complexo(0, 0);

        num1.iniciar(10, 2);
        num2.iniciar(10, 3);

        System.out.print("Num 1:");
        num1.imprimir();
        System.out.print("Num 2:");
        num2.imprimir();

        Complexo soma = num1.soma(num2);
        System.out.print("Soma:");
        soma.imprimir();

        Complexo subtracao = num1.subtrai(num2);
        System.out.print("Subtrai:");
        subtracao.imprimir();

        Complexo multiplicacao = num1.multiplica(num2);
        System.out.print("Multiplica:");
        multiplicacao.imprimir();

        Complexo divisao = num1.divide(num2);
        System.out.print("Divide:");
        divisao.imprimir();

        boolean saoIguais = num1.eIgual(num2);
        System.out.println("Num1 eh igual a Num2?" + saoIguais);
    }
}
