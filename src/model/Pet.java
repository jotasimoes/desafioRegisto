package model;

import java.time.LocalDateTime;

public class Pet {

    private static final String ni = "NÃO INFORMADO";

    private String nome;
    private PetTipo tipo;
    private PetGenero genero;
    private Morada morada;
    private Double idade;
    private Double peso;
    private String raca;
    private LocalDateTime dataRegisto;

    public Pet(){

    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar em branco.");
        }

        if(!nome.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("O nome deve conter apenas letras de A-Z.");
        }

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipoInput) {

        tipoInput= tipoInput.toUpperCase();

        if(tipoInput.equals("C")){
            this.tipo = PetTipo.Cao;
        }
        else if(tipoInput.equals("G")){
            this.tipo = PetTipo.Gato;
        }
        else{
            throw new IllegalArgumentException("Escolha um tipo válido de pet!");
        }

    }

    public PetTipo getTipo() {
        return tipo;
    }

    public PetGenero getGenero() {
        return genero;
    }

    public void setGenero(String generoInput) {
        generoInput=generoInput.toUpperCase();

        if(generoInput.equals("M")){
            this.genero=PetGenero.Macho;
        }
        else if(generoInput.equals("F")){
            this.genero=PetGenero.Femea;
        }
        else{
            throw new IllegalArgumentException("Escolha um género válido de pet!");
        }
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }

    public Morada getMorada() {
        return morada;
    }

    public void setIdade(String idade) {
        if(idade == null || idade.isEmpty()){
            this.idade=null;
        }else if(idade.matches("[-+]?\\d*\\.?\\d+")){
            this.idade=Double.valueOf(idade);
        }else{
            throw new NumberFormatException("Digite um número válido de idade!");
        }
    }

    public Double getIdade() {
        return idade;
    }


}
