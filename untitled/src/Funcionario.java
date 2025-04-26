public abstract class Funcionario {
    private String nome;
    private int numRegistro;

    public Funcionario(String nome, int numRegistro){
        this.nome = nome;
        this.numRegistro = numRegistro;
    }

    public abstract float calcularSalario();
}
