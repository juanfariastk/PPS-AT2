package repository;

import model.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;

public class RepositorioVeiculos {
    private ArrayList<Veiculo> veiculosCadastrados = new ArrayList<>();

    public void cadastrarVeiculo(Veiculo veiculo){
        veiculosCadastrados.add(veiculo);
    }

    public ArrayList<Veiculo> getVeiculosCadastrados(){
        return this.veiculosCadastrados;
    }

    public Veiculo buscarVeiculoPorId(String id){
        for(Veiculo veiculo:veiculosCadastrados){
            if(veiculo.getId().equals(id)){
                return veiculo;
            }
        }
        return null;
    }

    public ArrayList<Veiculo> buscarVeiculosPorTipo(String tipoVeiculo){
        ArrayList<Veiculo> veiculosPorTipo = new ArrayList<>();

        for (Veiculo veiculo : veiculosCadastrados) {
            if (veiculo.getClass().getSimpleName().toLowerCase().equals(tipoVeiculo.toLowerCase())) {
                veiculosPorTipo.add(veiculo);
            }
        }

        veiculosPorTipo.sort(Comparator.comparing(Veiculo::getId));

        return veiculosPorTipo;
    }

    public Veiculo buscarVeiculoComDiariaMaisCara(){
        Veiculo veiculoMaisCaro = this.veiculosCadastrados.get(0);

        for(Veiculo veiculo:veiculosCadastrados){
            if(veiculo.getValorDeCompra() > veiculoMaisCaro.getValorDeCompra()){
                veiculoMaisCaro = veiculo;
            }
        }

        return veiculoMaisCaro;
    }

    public int getQuantidadeCadastrada(){
        return this.veiculosCadastrados.size();
    }

}
