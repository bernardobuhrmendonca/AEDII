package EX_REV.EX07;

import java.io.*;
import java.util.Scanner;

public class Ex07 {
    private File diretorio;
    private File arquivo;
    private final Scanner teclado = new Scanner(System.in);

    public Ex07() {}

    public void criarDir() {
        //Nomear diretório:
        System.out.println("Nomeie o diretório.");
        String nomeTXTdir = teclado.nextLine();
        this.diretorio = new File("C:\\" + nomeTXTdir);

        //Criar diretório:
        boolean statusDir = this.diretorio.mkdir();
        System.out.println(statusDir);
    }

    public void criarTXT() {
        //Nomear arquivo:
        System.out.println("Nomeie o arquivo.");
        String nomeTXTarq = teclado.nextLine();
        this.arquivo = new File(this.diretorio, nomeTXTarq);

        //Criar arquivo:
        try {
            boolean statusArquivo = this.arquivo.createNewFile();
            System.out.println(statusArquivo);
        } catch (IOException excessao) {
            System.out.println("Erro!");
        }
    }

    public void preencherTXT() {
        //Determinar conteúdo do arquivo:
        String conteudo;
        Scanner texto = new Scanner(System.in);
        System.out.println("Indique o conteúdo que será salvo no arquivo txt.");
        conteudo = texto.nextLine();

        //Preencher arquivo:
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.arquivo));
            bufferedWriter.write(conteudo);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException excessao) {
            System.out.println("Erro!");
        }
        texto.close();
        this.teclado.close();
    }

    public void lerTXT() {
        try {
            FileReader fileReader = new FileReader(this.arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;
            while ((linha = bufferedReader.readLine() ) != null) {
                System.out.println(linha);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException excessao) {
            System.out.println("Erro!");
        }
    }
}
