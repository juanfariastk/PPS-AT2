package model;

public class Helicoptero extends VeiculoAereo{
    private int quantidadeDeRotores;

    public Helicoptero(String id, double valorDeCompra, double tempoVoo, int quantRotores){
        super(id, valorDeCompra,tempoVoo);
        this.quantidadeDeRotores = quantRotores;
    }

    public int getQuantidadeDeRotores() {
        return quantidadeDeRotores;
    }

    public void setQuantidadeDeRotores(int quantidadeDeRotores) {
        this.quantidadeDeRotores = quantidadeDeRotores;
    }

    @Override
    public double calcularDiariia() {
        return (0.1*getValorDeCompra())*this.getQuantidadeDeRotores();
    }
}
