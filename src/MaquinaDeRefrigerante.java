public class MaquinaDeRefrigerante {

    Refrigerante[] lista;
    float credito;

    public MaquinaDeRefrigerante(){
        lista = new Refrigerante[5];
        lista[0] = new Refrigerante("Coca Cola", 2.50f, 5);
        lista[1] = new Refrigerante("Fanta", 2.30f, 4);
        lista[2] = new Refrigerante("Pepsi", 2.35f, 5);
        lista[3] = new Refrigerante("Fruki", 1.99f, 3);
        lista[4] = new Refrigerante("Guarana", 2.20f, 5);
        this.credito = 0.0f;
    }

    public void inserirCredito(float valor){
        this.credito += valor;
    }

    public float solicitarTroco(){
        float troco = this.credito;
        this.credito = 0.0f;
        return troco;
    }

    public int comprarRefri(int numRefri){
        if (this.credito >= lista[numRefri].getPreco()){
            if (lista[numRefri].getQtd() > 0){
                this.credito -= lista[numRefri].getPreco();
                int novaQtd = lista[numRefri].getQtd()-1;
                lista[numRefri].setQtd(novaQtd);
                return 0;
            } else {
                return -2;
            }
        } else {
            return -1;
        }
    }

    public String mostrarInfo(){
        String str = "";
        str += "Crédito: " + this.credito + "\n";

        for (Refrigerante r : lista){
            str += "| " + r.getNome() + " - R$ " + r.getPreco() + "\n";
        }

        return str;
     }

}
