public class DieDemo {
    public static void main(String[] args) 
    {
        Die d1 = new Die();
        Die d2 = new Die();

        d1.roll();
        d1.roll();

        int res1 = d1.getSideUp();
        int res2 = d1.getSideUp();

        System.out.println("Primeiro: " + res1);
        System.out.println("Segundo: " + res2);
        System.out.println("Soma: " + (res1 + res2));
    }
}