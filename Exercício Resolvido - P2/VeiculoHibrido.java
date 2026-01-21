public abstract class VeiculoHibrido extends Veiculo implements Recarregavel, Reabastecivel {
    protected Motor motor;
    protected float gas;
    protected int bat;

    public VeiculoHibrido(int num, int qtdRodas, float cilin, String modo) 
    {
        super(num, qtdRodas);
        this.motor = new Motor(cilin, modo);
        this.gas = (float) (Math.random() * 100);
        this.bat = (int) (Math.random() * 100);
    }

    private boolean energiaDisponivel() {
        return gas > 0 || bat > 0;
    }

    @Override
    public void carregar() 
    {
        this.bat = 100;
    }

    public void setMotor(Motor motor) 
    {
        this.motor = motor;
    }

    @Override
    public void abastecer() {
        this.gas = 100;
    }

    public Motor getMotor() {
        return motor;
    }


    public float getGas() 
    {
        return gas;
    }

    public void setGas(float gas) 
    {
        this.gas = gas;
    }

    public int getBat() 
    {
        return bat;
    }

    public void setBat(int bat) 
    {
        this.bat = bat;
    }

    @Override
    public boolean movimenta() 
    {
        return super.movimenta() && energiaDisponivel();
    }

    @Override
    public void mover() 
    {
        if (movimenta()) {
            TotalDistancia += 10;
            if (motor.getMode().equals("gas")) 
            {
                gas -= motor.getRota() * Motor.gastoCombust;
            } 
            
            else 
            {
                bat -= motor.getRota() * Motor.gastoEnergia;
            }
        } 
        
        else 
        {
            System.out.println("Sem energia");
        }
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", gas=" + gas + ", bat=" + bat;
    }
}