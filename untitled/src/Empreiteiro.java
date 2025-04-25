public class Empreiteiro extends Funcionario {
    private float valorEmpreita;

    public Empreiteiro(String nome, int numRegistro, float valorEmpreita){
        super(nome, numRegistro);
        this.valorEmpreita = valorEmpreita;
    }

    public float getValorEmpreita(){
        return this.valorEmpreita;
    }

    public void setValorEmpreita(float valorEmpreita){
        this.valorEmpreita = valorEmpreita;
    }

    public float calcularSalario(float valor){
        return this.valorEmpreita * valor;
    }
}
