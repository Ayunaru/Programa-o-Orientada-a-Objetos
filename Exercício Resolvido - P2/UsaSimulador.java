public class UsaSimulador {
    public static void main(String[] args) 
    {
        Simular plataforma = new Simular();

        Veiculo bike = new Bicicleta(1);
        Veiculo moto = new Motocicleta(2);
        Veiculo carroPasseio = new CarroPasseio(3);
        Veiculo carroEsportivo = new CarroEsportivo(4);

        plataforma.addVeiculo(bike);
        plataforma.addVeiculo(moto);
        plataforma.addVeiculo(carroPasseio);
        plataforma.addVeiculo(carroEsportivo);

        plataforma.showAll();

        plataforma.movAll();

        plataforma.showAll();

        for (Veiculo veiculo : plataforma.getVeiculos()) 
        {
            veiculo.enchePneu();
            if (veiculo instanceof Reabastecivel) 
            {
                ((Reabastecivel) veiculo).abastecer();
            }
            if (veiculo instanceof Recarregavel) 
            {
                ((Recarregavel) veiculo).carregar();
            }
        }

        plataforma.movAll();

        plataforma.showAll();

        System.out.println("Cada '*' equivale a 10 metros");
    }
}