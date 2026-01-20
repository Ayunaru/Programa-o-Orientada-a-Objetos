public class TestFatura {
    public static void main(String[] args) 
    {

        Fatura fatura = new Fatura("007", "Fita", 5, 5.0);

        System.out.println("ID item:" + fatura.getnumPeca());
        System.out.println("Descricao do item:" + fatura.getdescricao());
        System.out.println("Quantia:" + fatura.getqtd());
        System.out.println("Preco por Item:" + fatura.getprecoItem());
        System.out.println("Total Fatura:" + fatura.obterTotal());

        fatura.setqtd(-1);
        fatura.setprecoItem(-1);

        System.out.println("\nCom qtd e preco neg:");
        System.out.println("Qtd:" + fatura.getqtd());
        System.out.println("Preco por item:" + fatura.getprecoItem());
        System.out.println("Total Fatura:" + fatura.obterTotal());
    }
}
