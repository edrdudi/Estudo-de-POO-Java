public class Cliente {
    private String nome;
    private String email;
    private float credito;

    public Cliente(String nome, String email, float credito) {
        this.nome = nome;
        this.email = email;
        this.credito = credito;
    }

    public void setCredito(float credito){
        this.credito = credito;
    }

    public float getCredito(){
        return this.credito;
    }

    @Override
    public String toString(){
        return "Cliente: " + this.nome + "(" + this.email + ") - R$" + this.credito;
    }

    public boolean fazerCompra(float valor){
        if (valor > this.credito){
            return false;
        } else {
            this.credito -= valor;
            return true;
        }
    }

    public void quitarDivida(float pagamento){
        this.credito += pagamento;
    }
}
