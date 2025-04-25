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

    public float getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public float getAdicionalFuncao(){
        return this.adicionalFuncao;
    }

    public void setAdicionalFuncao(float adicionalFuncao){
        this.adicionalFuncao = adicionalFuncao;
    }

    public float getBeneficioTerno(){
        return this.beneficioTerno;
    }

    public void setBeneficioTerno(float beneficioTerno){
        this.beneficioTerno = beneficioTerno;
    }

    public float calcularSalario(float valor){
        return salarioBase + adicionalFuncao + beneficioTerno;
    }
}
