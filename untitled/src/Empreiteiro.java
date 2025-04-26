public class Empreiteiro extends Funcionario {
    private float valorEmpreita;

    public Empreiteiro(String nome, int numRegistro, float valorEmpreita){
        super(nome, numRegistro);
        this.valorEmpreita = valorEmpreita;
    }

    public float calcularSalario(){
        return this.valorEmpreita;
    }
}