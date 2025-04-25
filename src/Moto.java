public class Moto extends Veiculo{
    private float fatorDesconto;

    public Moto(String modelo, String placa, float valorDiaria, float fatorDesconto){
        super(modelo, placa, valorDiaria);
        this.fatorDesconto = fatorDesconto;
    }

    public float calcularAluguel(int qtdDias){
        return (qtdDias * super.getValorDiaria()) - (qtdDias * super.getValorDiaria() * fatorDesconto);
    }
}
