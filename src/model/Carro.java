package model;

public class Carro extends VeiculoTerrestre{
    private double autonomiaCarro;

    public Carro(String id, double valorDeCompra, String motor, String placa, double autonomiaCarro){
        super(id, valorDeCompra, motor, placa);
        this.autonomiaCarro = autonomiaCarro;
    }

    public double getAutonomiaCarro() {
        return autonomiaCarro;
    }

    public void setAutonomiaCarro(double autonomiaCarro) {
        this.autonomiaCarro = autonomiaCarro;
    }

    @Override
    public double calcularDiariia() {
        return (0.02*getValorDeCompra());
    }
}
