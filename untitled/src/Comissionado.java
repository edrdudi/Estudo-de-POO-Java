public class Comissionado extends Funcionario {
    private float salarioBase;
    private float comissao;

    public Comissionado (String nome, int numRegistro, float salarioBase, float comissao) {
        super(nome, numRegistro);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public float calcularSalario(){
        return this.salarioBase + (this.salarioBase * this.comissao);
    }
}
