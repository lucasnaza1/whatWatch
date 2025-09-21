import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite aqui o título: ");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento?");
        int ano = leitura.nextInt();
        System.out.println(ano);
        System.out.println("Digite sua avaliação: ");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);
        System.out.println("Titulo escolhido: " + filme + "\n" + "Ano de lançamento: " + ano + "\n" + "Sua avaliação: " + avaliacao);
    }
}
