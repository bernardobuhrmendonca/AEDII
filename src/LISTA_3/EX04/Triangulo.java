package LISTA_3.EX04;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String classificacao_lados;

    public Triangulo(double lado1, double lado2, double lado3) throws TrianguloInvalidoError {
        if (lado1 <=0 | lado2 <= 0 | lado3 <= 0 |
                lado1 + lado2 < lado3 | lado1 + lado3 < lado2 | lado2 + lado3 < lado1 |
                Math.abs(lado1 - lado2) > lado3 | Math.abs(lado1 - lado3) > lado2 | Math.abs(lado2 - lado3) > lado1 ) {
            throw new TrianguloInvalidoError();
        } else {
            setLado1(lado1);
            setLado2(lado2);
            setLado3(lado3);
        }
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setClassificacao_lados(String classificacao_lados) {
        this.classificacao_lados = classificacao_lados;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public String getClassificacao_lados() {
        return classificacao_lados;
    }
    public int determinarTipo() {
        if (getLado1() == getLado2() & getLado2() == getLado3()) {
            setClassificacao_lados("Equilátero");
            return 0;
        }
        else if (getLado1() == getLado2() | getLado1() == getLado3() | getLado2() == getLado3()){
            setClassificacao_lados("Isóceles");
            return 1;
        } else {
            setClassificacao_lados("Escaleno");
            return 2;
        }
    }
}
