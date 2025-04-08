public class Refrigerante {
    private String nome;
    private float preco;
    private int qtd;

    public Refrigerante(String nome, float preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco(){
        return this.preco;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public int getQtd(){
        return this.qtd;
    }
}