public class ClienteVip extends Cliente{
    private float creditoEspecial;

    public ClienteVip(String nome, String email, float credito, float creditoEspecial){
        super (nome, email, credito);
        this.creditoEspecial = creditoEspecial;
    }

    public void setCreditoEspecial(){
        this.creditoEspecial = creditoEspecial;
    }

    public float getCreditoEspecial(float creditoEspecial){
        return this.creditoEspecial;
    }

    @Override
    public String toString(){
        return "(VIP)" + super.toString() + " // Credito Especial: R$" + this.creditoEspecial;
    }

    public boolean fazerCompra(float valor){
        if (valor > super.getCredito() + this.creditoEspecial) {
            return false;
        } else {
            super.setCredito(super.getCredito() - valor);
            return true;
        }
    }
}
