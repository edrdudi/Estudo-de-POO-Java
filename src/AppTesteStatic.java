public class AppTesteStatic {
    public static void main (String[] args){
        TesteStatic t1, t2;

        t1 = new TesteStatic();
        t2 = new TesteStatic();

        t1.at1 = 100;
        t1.at2 = 200;

        t2.at1 = 300;
        t2.at2 = 400;

        TesteStatic.AT3 = 500;

        t1.exibirValores();

        t1.AT3 = 450;
        t2.exibirValores();

        TesteStatic.metodoStatic("É isso!");
    }
}
