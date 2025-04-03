public class Carro {
    private String marca;
    private String modelo;
    private int potencia;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public int getPotencia(){
        return this.potencia;
    }

    public void exibirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potencia);
    }
}
