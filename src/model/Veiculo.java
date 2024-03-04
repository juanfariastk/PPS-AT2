package model;

public abstract class Veiculo {
    private String id;
    private double  valorDeCompra;

    public Veiculo(String id, double valorDeCompra) {
        this.id = id;
        this.valorDeCompra = valorDeCompra;
    }

    public abstract double calcularDiariia();

    public String getId() {
        return id;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }
}
