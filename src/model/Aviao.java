package model;

public class Aviao extends VeiculoAereo{
    private double velocidadeDeCruzeiro;

    public Aviao(String id,  double valorDeCompra,  double tempoDeVoo,  double velocidadeDeCruzeiro){
        super(id, valorDeCompra, tempoDeVoo);
        this.velocidadeDeCruzeiro = velocidadeDeCruzeiro;
    }

    public double getVelocidadeDeCruzeiro() {
        return velocidadeDeCruzeiro;
    }

    public void setVelocidadeDeCruzeiro(double velocidadeDeCruzeiro) {
        this.velocidadeDeCruzeiro = velocidadeDeCruzeiro;
    }

    @Override
    public double calcularDiariia() {
        return (0.2*getValorDeCompra())+(1000*getVelocidadeDeCruzeiro());
    }
}
