package model;

public  abstract class VeiculoTerrestre extends  Veiculo{
    private String motorVeiculo;
    private String placaVeiculo;

    public VeiculoTerrestre(String id, double valorDeCompra, String motorVeiculo, String placaVeiculo) {
        super(id, valorDeCompra);
        this.motorVeiculo = motorVeiculo;
        this.placaVeiculo = placaVeiculo;
    }

    public String getMotorVeiculo() {
        return motorVeiculo;
    }

    public void setMotorVeiculo(String motorVeiculo) {
        this.motorVeiculo = motorVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
}
