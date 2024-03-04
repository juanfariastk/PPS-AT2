package model;

public class Moto extends VeiculoTerrestre{
    private String sistemaDePartida;

    public Moto(String id, double valorDeCompra, String motor, String placa, String sistemaPartida){
        super(id, valorDeCompra, motor, placa);
        this.sistemaDePartida = sistemaPartida;
    }

    public String getSistemaDePartida() {
        return sistemaDePartida;
    }

    public void setSistemaDePartida(String sistemaDePartida) {
        this.sistemaDePartida = sistemaDePartida;
    }

    @Override
    public double calcularDiariia() {
        if(this.sistemaDePartida.toLowerCase().equals("eletrico")){
            return (0.02*getValorDeCompra())+20;
        }
        return (0.02*getValorDeCompra())+5;
    }
}
