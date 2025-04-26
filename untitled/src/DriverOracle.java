public class DriverOracle implements InterfaceBD{

    public void conectar(String servidor){
        System.out.println("Conectando em ORACLE " + servidor);
    }

    public void executar(String SQL) {
        System.out.println("ORACLE: " + SQL);
    }
}