public class BombaCombustível {
    private String combustivel;
    private float precoLitro;
    private float precoTotal;
    private float qtdLitros;
    private boolean emUso;

    public BombaCombustível(String combustivel, float preco) {
        this.combustivel = combustivel;
        this.precoLitro = preco;
        this.qtdLitros = 0f;
        this.precoTotal = 0f;
        this.emUso = false;
    }

    public void puxarGancho(){
        this.emUso = true;
        this.precoTotal = 0.0f;
        this.qtdLitros = 0.0f;
        System.out.println("Bomba " + this.combustivel + " pronta para uso");
        System.out.println("Digite o valor a ser abastecido:");
    }

    public void voltarGancho () {
        this.emUso = false;
        System.out.println("Combustivel: " + this.combustivel);
        System.out.println("Preco do Litro: R$" + this.precoLitro);
        System.out.println("Valor a pagar: R$" + this.precoTotal);
        System.out.println("Litros abastecidos: " + qtdLitros);
        System.out.println("");
    }

    public void abastecerPorValor(float valor){
        if (this.emUso) {
            this.precoTotal = valor;
            this.qtdLitros = this.precoTotal / this.precoLitro;
        } else {
            System.out.println("Aguarde até a bomba ficar disponivel");
        }
    }

    public void abastecerPorLitro(float litros) {
        if(this.emUso) {
            this.qtdLitros = litros;
            precoTotal = precoLitro * litros;
        } else {
            System.out.println("Aguarde até a bomba ficar disponivel");
        }
    }
}
