public class Chefe extends Funcionario {
    private float salarioBase;
    private float adicionalFuncao;
    private float beneficioTerno;

    public Chefe (String nome, int numRegistro, float salarioBase, float adicionalFuncao, float beneficioTerno){
        super(nome, numRegistro);
        this.salarioBase = salarioBase;
        this.adicionalFuncao = adicionalFuncao;
        this.beneficioTerno = beneficioTerno;
    }

    public float calcularSalario(){
        return this.salarioBase + this.salarioBase * adicionalFuncao/100 + beneficioTerno;
    }
}
