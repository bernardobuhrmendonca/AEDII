package LISTA_2.EX01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João","Silva");
        Funcionario pessoa2 = new Funcionario("Maria", "Medeiros");
        pessoa2.setSalario(1750);
        Professor pessoa3 = new Professor("José", "Souza");
        pessoa3.setSalario(-500);
        Professor pessoa4 = new Professor("Ana", "Oliveira");
        pessoa4.setSalario(1500);
        System.out.println(pessoa1.getNomeCompleto());
        System.out.println(pessoa2.getNomeCompleto());
        System.out.println(pessoa3.getNomeCompleto());
        System.out.println(pessoa4.getNomeCompleto());
        System.out.println(pessoa2.getSalarioPrimeiraParcela());
        System.out.println(pessoa2.getSalarioSegundaParcela());
        System.out.println(pessoa3.getSalarioPrimeiraParcela());
        System.out.println(pessoa3.getSalarioSegundaParcela());
        System.out.println(pessoa4.getSalarioPrimeiraParcela());
        System.out.println(pessoa4.getSalarioSegundaParcela());
    }
}
