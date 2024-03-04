package facade;

import model.*;
import repository.RepositorioVeiculos;

import java.util.ArrayList;

public class Fachada {

    private RepositorioVeiculos repositorioVeiculos = new RepositorioVeiculos();

    public void cadastrarAviao(String id, double valorDeCompra, double tempoDeVoo, double velocidadeDeCruzeiro) {
        Aviao aviao = new Aviao( id, valorDeCompra, tempoDeVoo, velocidadeDeCruzeiro);
        if (!verificarId(id)) {
            repositorioVeiculos.cadastrarVeiculo(aviao);
        } else {
            System.out.println("ID já existente. Cadastro não realizado.");
        }
    }

    public void cadastrarMoto(String id, double valorDeCompra, String motor, String placa, String sistemaPartida) {
        Moto moto = new Moto(id, valorDeCompra, motor, placa, sistemaPartida);
        if (!verificarId(id)) {
            repositorioVeiculos.cadastrarVeiculo(moto);
        } else {
            System.out.println("ID já existente. Cadastro não realizado.");
        }
    }

    public void cadastrarCarro(String id, double valorDeCompra, String motor, String placa, double autonomiaCarro) {
        Carro carro = new Carro(id, valorDeCompra, motor, placa, autonomiaCarro);
        if (!verificarId(id)) {
            repositorioVeiculos.cadastrarVeiculo(carro);
        } else {
            System.out.println("ID já existente. Cadastro não realizado.");
        }
    }

    public void cadastrarHelicoptero(String id, double valorDeCompra, double tempoVoo, int quantRotores) {
        Helicoptero helicoptero = new Helicoptero(id, valorDeCompra, tempoVoo, quantRotores);
        if (!verificarId(id)) {
            repositorioVeiculos.cadastrarVeiculo(helicoptero);
        } else {
            System.out.println("ID já existente. Cadastro não realizado.");
        }
    }

    public void cadastrarOnibus(String id, double valorDeCompra, String motor, String placa, int quantPassageiros) {
        Onibus onibus = new Onibus(id, valorDeCompra, motor, placa, quantPassageiros);
        if (!verificarId(id)) {
            repositorioVeiculos.cadastrarVeiculo(onibus);
        } else {
            System.out.println("ID já existente. Cadastro não realizado.");
        }
    }

    public Veiculo buscarVeiculoPorId(String id){
        return repositorioVeiculos.buscarVeiculoPorId(id);
    }

    public ArrayList<Veiculo> buscarVeiculoPorTipo(String tipo){
        return repositorioVeiculos.buscarVeiculosPorTipo(tipo);
    }

    public Veiculo buscarDiariaMaisCara(){
        return repositorioVeiculos.buscarVeiculoComDiariaMaisCara();
    }

    public ArrayList<Veiculo> veiculosAtualmenteCadastrados(){
        return repositorioVeiculos.getVeiculosCadastrados();
    }


    public boolean verificarId(String idAtual){
        for(Veiculo veiculo: repositorioVeiculos.getVeiculosCadastrados()){
                if(veiculo.getId().toLowerCase().equals(idAtual)){
                    return true;
                }
        }
        return false;
    }

}
