public class AppHeranca {
    public static void main (String[] args){
        APessoa p = new APessoa("Eduardo", "Eduardo@edu");

        Funcionario f = new Funcionario("Isi", "isi@isi", 5000);

        System.out.println(p);
        System.out.println(f);
    }
}
