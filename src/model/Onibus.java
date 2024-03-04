package model;

public class Onibus extends  VeiculoTerrestre{
    private int quantidadeDePassageiros;

    public Onibus(String id, double valorDeCompra, String motor, String placa, int quantPassageiros){
        super(id, valorDeCompra, motor, placa);
        this.quantidadeDePassageiros = quantPassageiros;
    }

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }

    public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    @Override
    public double calcularDiariia() {
        return (0.04*getValorDeCompra())+(100*quantidadeDePassageiros);
    }
}
