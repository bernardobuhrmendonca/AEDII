package LISTA_2.EX01;

public class Funcionario extends Pessoa {
    //Atributos:

    private int matricula;
    private double salario;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Construtor:

    public Funcionario(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Setters:

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        if (salario < 0){
            System.out.println("O salário não pode ser menor que zero.");
        }
        else {
            this.salario = salario;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getters:

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioPrimeiraParcela() {
        double PrimeiraParcela;
        PrimeiraParcela = getSalario() * 60 / 100;
        return PrimeiraParcela;
    }

    public double getSalarioSegundaParcela() {
        double SegundaParcela;
        SegundaParcela = getSalario() * 40 / 100;
        return SegundaParcela;
    }
}
