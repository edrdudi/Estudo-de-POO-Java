public class AppPessoa {
    public static void main (String[] args) {
        Pessoa Eduardo = new Pessoa();

        Eduardo.setNome("Eduardo");
        Eduardo.setEmail("du@gmail");
        Eduardo.setSalario(2400.00f);

        Eduardo.aumentarSalario(15f);
        Eduardo.exibirDados();
    }
}