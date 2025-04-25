public class Horista extends Funcionario {
    private float valorHora;
    private int numHoras;

    public Horista(String nome, int numRegistro, float valorHora, int numHoras){
        super(nome, numRegistro);
        this.valorHora = valorHora;
        this.numHoras = numHoras;
    }

    public float getValorHora(){
        return this.valorHora = valorHora;
    }

    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }

    public int getNumHoras(){
        return this.numHoras;
    }

    public void setNumHoras(int numHoras){
        this.numHoras = numHoras;
    }

    @Override
    public float calcularSalario(float valor) {
        return valor + (this.numHoras * this.valorHora);
    }
}
