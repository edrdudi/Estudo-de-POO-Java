public class AppPessoa {
    public static void main (String[] args) {
        Pessoa Eduardo = new Pessoa("Eduardo ", "du@gmail", 2400);
        Pessoa Natalie = new Pessoa("Natalie", 3000);

        Eduardo.aumentarSalario(15);
        Natalie.exibirDados();
        Eduardo.exibirDados();
    }
}