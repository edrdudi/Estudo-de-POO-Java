public class Comissionado extends Funcionario {
    private float salarioBase;
    private float comissao;

    public Comissionado (String nome, int numRegistro, float salarioBase, float comissao) {
        super(nome, numRegistro);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public float getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public float getComissao(){
        return this.comissao;
    }

    public void setComissao(float comissao){
        this.comissao = comissao;
    }

    public float calcularSalario(float valor){
        return this.salarioBase + (this.comissao * valor);
    }
}
