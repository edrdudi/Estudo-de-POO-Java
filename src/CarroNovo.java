public class CarroNovo extends Veiculo {

    public CarroNovo(String modelo, String placa, float valorDiaria){
        super(modelo, placa, valorDiaria);
    }

    public float calcularAluguel(int qtdDias){
        return qtdDias * super.getValorDiaria();
    }
}