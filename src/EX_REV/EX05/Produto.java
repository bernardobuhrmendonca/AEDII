package EX_REV.EX05;

public class Produto {

    //Atributos:

    private int id;
    private String descricao;
    private float preco;
    private int quant;
    private static int cont;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Constructores:

    public Produto(String descricao, float preco, int quant){
        setDescricao(descricao);
        setPreco(preco);
        setQuant(quant);
    }
    public Produto() {}

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Setters:

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQuant(int quant) {
        if (quant > 0) {
            this.quant = quant;
        }
        else {
            System.out.println("Valor inválido, tente novamente.");
        }
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getters:

    public float getPreco() {
        return this.preco;
    }

    public int getQuant() {
        return this.quant;
    }

    public static int getCont() {
        return cont;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Métodos adicionais:

    public boolean emEstoque() {
        return (getQuant()>0);

    }

}
