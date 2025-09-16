import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu Filme favorito?");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual sua avaliação sobre o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);




    }
}
