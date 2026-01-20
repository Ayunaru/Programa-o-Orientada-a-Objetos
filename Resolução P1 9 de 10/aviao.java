public class aviao 
{
    private motor[] motores;
    private double peso;
    private int maxPassageiros;
    private double vel;
    private int maxTripulantes;
    private piloto piloto;

    public aviao(int numMotores, String tipoMotor, double peso, int maxTripulantes, int maxPassageiros, piloto piloto) 
    {
        this.motores = new motor[numMotores];
        
        for (int i = 0; i < numMotores; i++) 
        {
            motores[i] = new motor(tipoMotor);
        }
        

        this.maxTripulantes = maxTripulantes;
        this.peso = peso;
        this.maxPassageiros = maxPassageiros;
        this.vel = 0;
        this.piloto = piloto;
    }

    public void ligar() 
    {
        for (motor motor : motores) 
        {
            motor.ligar();
        }
            
    }

    public void desligar() 
    {
        for (motor motor : motores) 
        {
            motor.desligar();
        }
        
    }

    public void aumentaVel(double incremento) 
    {
        this.vel += incremento;
        
        for (motor motor : motores) 
        {
            motor.setPotencia(motor.getPotencia() + incremento);
        }
    }

    public void diminuirVel(double decremento) 
    {
        this.vel -= decremento;
        
        for (motor motor : motores) 
        {
            motor.setPotencia(motor.getPotencia() - decremento);
        }
    }

    public void direcionar(String direcao, double intensidade) 
    {
        System.out.println("direcionando para ... " + direcao + " com uma intensidade de... " + intensidade);
    }

    public double getVel() 
    {
        return vel;
    }

    public piloto getPiloto() 
    {
        return piloto;
    }
}