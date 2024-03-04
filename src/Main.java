import facade.Fachada;
import model.Veiculo;

public class Main {
    public static  void main(String[] args) {
        Fachada fachada = new Fachada();

        fachada.cadastrarAviao("AV001", 1000000, 10, 500);
        fachada.cadastrarAviao("AV002", 1200000, 12, 550);
        fachada.cadastrarAviao("AV003", 900000, 9, 480);
        fachada.cadastrarAviao("AV004", 1100000, 11, 520);
        fachada.cadastrarAviao("AV005", 950000, 10.5, 490);


        fachada.cadastrarMoto("MOTO001", 5000, "MotorXYZ", "ABC123", "Elétrico");
        fachada.cadastrarMoto("MOTO002", 6000, "MotorABC", "XYZ456", "PartidaManual");
        fachada.cadastrarMoto("MOTO003", 5500, "Motor123", "DEF789", "Elétrico");
        fachada.cadastrarMoto("MOTO004", 6500, "MotorXYZ", "GHI101", "PartidaManual");
        fachada.cadastrarMoto("MOTO005", 7000, "MotorABC", "JKL112", "Elétrico");


        fachada.cadastrarCarro("CAR001", 20000, "MotorABC", "XYZ789", 600);
        fachada.cadastrarCarro("CAR002", 22000, "MotorXYZ", "ABC456", 550);
        fachada.cadastrarCarro("CAR003", 18000, "Motor123", "DEF101", 700);
        fachada.cadastrarCarro("CAR004", 24000, "MotorXYZ", "GHI112", 500);
        fachada.cadastrarCarro("CAR005", 21000, "MotorABC", "JKL123", 650);


        fachada.cadastrarHelicoptero("HEL001", 800000, 8, 4);
        fachada.cadastrarHelicoptero("HEL002", 900000, 7, 3);
        fachada.cadastrarHelicoptero("HEL003", 750000, 9, 5);
        fachada.cadastrarHelicoptero("HEL004", 850000, 8.5, 4);
        fachada.cadastrarHelicoptero("HEL005", 820000, 8.2, 4);


        fachada.cadastrarOnibus("ONI001", 50000, "Motor123", "DEF456", 40);
        fachada.cadastrarOnibus("ONI002", 52000, "MotorXYZ", "ABC789", 38);
        fachada.cadastrarOnibus("ONI003", 48000, "MotorABC", "XYZ101", 42);
        fachada.cadastrarOnibus("ONI004", 54000, "MotorXYZ", "GHI112", 36);
        fachada.cadastrarOnibus("ONI005", 51000, "MotorABC", "JKL123", 44);

        for(Veiculo veiculo: fachada.veiculosAtualmenteCadastrados()){
            System.out.println(veiculo.getId() + " | " + veiculo.getValorDeCompra());
        }

        System.out.println("Veiculo com diária mais cara " + fachada.buscarDiariaMaisCara().getId() );

        System.out.println("Veiculo com ID escolhido encontrado: " + fachada.buscarVeiculoPorId("HEL002").getId());

        System.out.println("Buscar veículos do tipo Carro");
        for(Veiculo veiculo : fachada.buscarVeiculoPorTipo("Carro")){
            System.out.println(" | "+veiculo.getId()+" | " );
        }
    }
}