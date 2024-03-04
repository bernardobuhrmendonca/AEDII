package LISTA_3.EX01.exception.creation;

public class Conta {

    //Atributos:

    private double saldo;
    private String nome;
    private String cpf;
    private double limite;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Construtor:

    public Conta(String nome, String cpf, double saldo, double limite) {
        setNome(nome);
        setCpf(cpf);
        setSaldo(saldo);
        setLimite(limite);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Setters:

    public void setSaldo(double saldo) {
        //Operador ternário: (condição) ? causa : contraconcequência =
        // if (condição) {consequência} else {contraconsequência}
        this.saldo = (saldo < 0 ) ? 0 : saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Getters:

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getLimite() {
        return limite;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //ToString:

    public String toString() {
        return "Cliente: " +  nome +
                "\nCPF: " + cpf +
                "\nSaldo: " + saldo +
                "\nLimite: " + limite;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Outros Métodos:

    public void deposita(double valor) {
        setSaldo((valor < 0) ? 0 : getSaldo() + valor);
    }
    public void saca(double valor) throws SaldoInsuficienteException{
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - valor);
        }
        else if (valor >= (getSaldo() + getLimite())){
            setSaldo(0);
            setLimite(valor - getSaldo());
            throw new SaldoInsuficienteException("O saque ultrapassou o valor do saldo e você entrou no limite em: "
                    + (valor - getSaldo()));
        }
        else {
            throw new SaldoInsuficienteException ("Seu saldo, somado ao seu limite, é: " + (getSaldo() + getLimite())
                    + "\nVocê tentou sacar: " + valor);
        }
    }
}
