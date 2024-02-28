package LISTA_2.EX01;

public class Professor extends Funcionario{
    public Professor(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}
