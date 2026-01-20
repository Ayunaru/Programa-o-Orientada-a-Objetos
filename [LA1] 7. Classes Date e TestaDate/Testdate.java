public class Testdate{
    public static void main(String[] args) 
    {
        Date data = new Date(01, 01, 2000);
        data.mostraData();

        data.setdia(21);
        data.setmes(13);
        data.setano(100);

        data.mostraData();

        data.setdia(22);
        data.setmes(-1);
        data.setano(1000);

        data.mostraData();
    }
}