package model;

public abstract  class VeiculoAereo extends Veiculo {
    private  double tempoDeVoo;

    public VeiculoAereo(String id, double valorDeCompra, double tempoDeVoo) {
        super(id, valorDeCompra);
        this.tempoDeVoo = tempoDeVoo;
    }

    public double getTempoDeVoo() {
        return tempoDeVoo;
    }

    public void setTempoDeVoo(double tempoDeVoo) {
        this.tempoDeVoo = tempoDeVoo;
    }
}
