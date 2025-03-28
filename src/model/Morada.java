package model;

public class Morada {

    private static final String ni = "NÃO INFORMADO";

    private String rua;
    private String numero;
    private String cidade;

    public Morada() {
        this.rua=ni;
        this.numero= ni;
        this.cidade=ni;
    }

    public void setNumero(String numero) {
        if(numero == null || numero.isEmpty()){
           this.numero=ni;
        }else if(numero.matches("[-+]?\\d*\\.?\\d+")){
            this.numero=numero;
        }else{
           throw new NumberFormatException("Digite um número válido de morada!");
        }
    }

    public void setRua(String rua) {
        if (rua != null && !rua.isEmpty()) {
            this.rua = rua;
        }
        else{
            this.rua=ni;
        }
    }

    public void setCidade(String cidade) {
        if (cidade != null && !cidade.isEmpty()) {
            this.cidade = cidade;
        }else{
            this.cidade=ni;
        }
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return rua+" - "+numero+" - "+cidade;
    }
}
