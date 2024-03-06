package LISTA_3.EX01.exception.creation;

import javax.swing.JOptionPane;

public class Banco {
    public static void main(String[] args) {
        String nome = typeString("Digite o nome do cliente.");
        String cpf = typeString("Digite o cpf do cliente.");
        double saldo = typeDouble("Digite o saldo inicial do cliente.");
        double limite = typeDouble("Digite o limite do cliente.");

        Conta c = new Conta(nome, cpf, saldo, limite);
        double deposito = typeDouble("DIgite o valor do depósito.");
        c.deposita(deposito);

        double saque = typeDouble("Digite o valor do saque.");

        try {
            c.saca(saque);
        } catch (SaldoInsuficienteException ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage());

        }
        JOptionPane.showMessageDialog(null, c.toString());
    }

    private static double typeDouble(String txt) {
        double d = 0;
        try {
            String userInput = JOptionPane.showInputDialog(null, txt);
            d = Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
            typeDouble("Erro, caracteres não identificados. Digite novamente.");
        }
        return d;
    }

    private static String typeString (String txt) {
        return JOptionPane.showInputDialog(null,txt);
    }
}
