public class AppDocumento {
    public static void main (String[] args){
        Documento doc1, doc2, doc3;
        doc1 = new Documento(1, "Contrato");
        doc2 = new Documento(2, "Peticao");
        doc3 = new Documento(3, "Carlos");

        doc1.exibirDados();

        doc1.setStatus(Documento.PROCESSANDO);
        doc1.exibirDados();
    }
}
