public class BombaCombustível {
    private String combustivel;
    private float precoLitro = 5;
    private float precoTotal;
    private float qtdLitros;
    private boolean emUso;

    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    public String getCombustivel(){
        return this.combustivel;
    }

    public void setPrecoLitro(float precoLitro){
        this.precoLitro = precoLitro;
    }

    public float getPrecoLitro(){
        return this.precoLitro;
    }

    public void setPrecoTotal(float precoTotal){
        this.precoTotal = precoTotal;
    }

    public float getPrecoTotal(){
        return this.precoTotal;
    }

    public void setQtdLitros(float qtdLitros){
        this.qtdLitros = qtdLitros;
    }

    public float getQtdLitros(){
        return this.qtdLitros;
    }

    public void setEmUso(boolean emUso){
        this.emUso = emUso;
    }

    public boolean getEmUso(){
        return this.emUso;
    }

    public void abastecerPorValor(float valor){
        qtdLitros = valor / precoLitro;
        System.out.println("Valor a pagar: R$" +valor);
        System.out.println("Litros abastecidos: " + qtdLitros);
    }
}
