package LISTA_3.EX04;

public class Main {
    public static void main(String[] args) {
        //Equilátero:
        try {
            Triangulo equilatero = new Triangulo(10,10,10);
            equilatero.determinarTipo();
            System.out.println(equilatero.getClassificacao_lados() + " (" + equilatero.determinarTipo() + ")");
        } catch (TrianguloInvalidoError e) {
            System.out.println("Erro! Valores inválidos para a existência de um triângulo.");
        }

        //Isóceles:
        try {
            Triangulo isoceles = new Triangulo(10,12,10);
            isoceles.determinarTipo();
            System.out.println(isoceles.getClassificacao_lados()+ " (" + isoceles.determinarTipo() + ")");
        } catch (TrianguloInvalidoError e) {
            System.out.println("Erro! Valores inválidos para a existência de um triângulo.");
        }

        //Escaleno:
        try {
            Triangulo escaleno = new Triangulo(10,8,9);
            escaleno.determinarTipo();
            System.out.println(escaleno.getClassificacao_lados()+ " (" + escaleno.determinarTipo() + ")");
        } catch (TrianguloInvalidoError e) {
            System.out.println("Erro! Valores inválidos para a existência de um triângulo.");
        }

        //Erro:
        try {
            Triangulo erro = new Triangulo(10,-5,550);
            erro.determinarTipo();
            System.out.println(erro.getClassificacao_lados() + " (" + erro.determinarTipo() + ")");
        } catch (TrianguloInvalidoError e) {
            System.out.println("Erro! Valores inválidos para a existência de um triângulo.");
        }
    }
}
