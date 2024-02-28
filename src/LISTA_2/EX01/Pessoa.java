package LISTA_2.EX01;

public class Pessoa {
    //Atributos:

    private String nome;
    private String sobrenome;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Construtores:

    public Pessoa() {}

    public Pessoa(String nome, String sobrenome) {
        setNome(nome);
        setSobrenome(sobrenome);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Setters:

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getters:


    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

   public String getNomeCompleto() {
        String nomeCompleto;
        nomeCompleto = this.nome + " " + this.sobrenome;
        return nomeCompleto;
   }
}
