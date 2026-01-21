import java.util.ArrayList;
import java.util.List;

public class Simular {

    private static final int MAX = 10;
    private List<Veiculo> listaVeiculos;

    public List<Veiculo> getVeiculos() 
    {
        return listaVeiculos;
    }

    public Simular() {
        this.listaVeiculos = new ArrayList<>();
    }

    public void addVeiculo(Veiculo veiculo) 
    {
        if (listaVeiculos.size() < MAX) 
        {
            listaVeiculos.add(veiculo);
        } 
        
        else 
        {
            System.out.println("Sem espaco");
        }
    }

    public void movAll() 
    {
        for (Veiculo veiculo : listaVeiculos) 
        {
            veiculo.mover();
        }
    }

    public void showAll() 
    {
        System.out.println("\n> Simulador de corrida <\n");

        for (Veiculo veiculo : listaVeiculos) 
        {
            System.out.println(veiculo.printa());
            System.out.println("Total: " + veiculo.getTotalDistancia() + " metros\n");
        }
        System.out.println("________________________________________\n");
    }
}