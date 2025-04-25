public abstract class Funcionario {
    private String nome;
    private int numRegistro;

    public Funcionario(String nome, int numRegistro){
        this.nome = nome;
        this.numRegistro = numRegistro;
    }

    public int getNumRegistro(){
        return this.numRegistro;
    }

    public void setNumRegistro(int numRegistro){
        this.numRegistro = numRegistro;
    }

    public String getnome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract float calcularSalario(float valor);
}
