package SIM_2.EX03;

import java.util.Scanner;
public class Questao3Sim {


    public static boolean EquacaoCorreta(String entrada) {
        Pilha<String> pilha = new Pilha<>();
        int contAbre = 0, contFecha = 0;
        String[] vet;
        vet = entrada.split("");
        boolean correta = true;
        for (int aux = 0; aux < entrada.length(); aux++) {
            pilha.inserir(vet[aux]);
        }
        try {
            if (pilha.remover().equalsIgnoreCase(")")) {
                return correta = false;
            } else {
                while(pilha.getTamanho() > 1) {
                    if (contFecha > contAbre) {
                    return correta = false;
                    } else if (pilha.remover().equalsIgnoreCase("(")) {
                        contAbre++;
                    } else if (pilha.remover().equalsIgnoreCase(")")) {
                        contFecha++;
                    }
                    pilha.remover();
                }
                if (pilha.remover().equalsIgnoreCase("(")) {
                        return correta = false;
                } else if (contFecha + 1 != contAbre) {
                    return correta = false;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return correta;
    }


    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite a equação: ");
            String equacao = sc.nextLine();

            if (EquacaoCorreta(equacao))
                System.out.println("Equação Correta");
            else
                System.out.println("Equação incorreta");
            sc.close();


        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }

    }

}
