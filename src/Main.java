//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //    System.out.println("Olá mundo!");
    //    System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
    //    System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (8.2 + 9.4 + 7.8) / 3;
        String sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de lançamento
        """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);

        System.out.println(classificacao);

    }
}