public class DriverMySQL implements InterfaceBD {

    public void conectar(String servidor){
        System.out.println("Conectando em SQL " + servidor);
    }

    public void executar(String SQL) {
        System.out.println("SQL: " + SQL);
    }
}
