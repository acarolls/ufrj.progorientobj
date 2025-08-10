public class Carro extends VeiculoTerrestre{
    //Inner class    
    private class Motor{
    private Combustivel modeloMotor;
    public Motor(Combustivel modeloMotor) {
        this.modeloMotor = modeloMotor;
    }
    public void liga() { }
    }
    private Motor meuMotor;

    public Carro(String modelo, Combustivel modeloMotor){
    this.modelo = modelo;
    meuMotor = new Motor(modeloMotor);
    }
    @Override
    public void liga(){
        meuMotor.liga();
        System.out.println(modelo + " ligado! (Carro)");
    }
}


