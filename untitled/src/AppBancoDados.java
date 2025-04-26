public class AppBancoDados {
    public static void main (String[] args){

        InterfaceBD x = new DriverMySQL();
        x.conectar("local SQL");
        x.executar("Select SQL");

        InterfaceBD y = new DriverOracle();
        y.conectar("local ORACLE");
        y.executar("Select ORACLE");
    }
}
