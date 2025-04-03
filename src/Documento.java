public class Documento {
    private int id;
    private String nome;
    private int status;

    public static final int NOVO = 0;
    public static final int PROCESSANDO = 1;
    public static final int AGUARDANDO = 2;
    public static final int FINALIZADO = 3;

    public Documento(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.status = NOVO;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void exibirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Status: " + status);
    }
}