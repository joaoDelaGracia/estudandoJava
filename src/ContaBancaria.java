import java.util.Scanner;

public class ContaBancaria {


    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int valorDeEscolha = 0;
        double saldo = 2500.00;
        String textoInicial =  String.format("""
                ************************************************************************
                Dados iniciais do cliente
                
                Nome:                                                        João Victor
                Tipo conta:                                                     Corrente
                Saldo inicial:                                                    %.2f
                ************************************************************************
                """, saldo);
        String textoDasOpcoes = """
                
                Operações
                
                1- Consultar saldos
                2- Deposite valor
                3- Transfira valor
                4- Sair
                
                Digite a opção desejada:
                """;

        System.out.println(textoInicial);
        while(valorDeEscolha != 4){
            System.out.println(textoDasOpcoes);
            valorDeEscolha = leitura.nextInt();

            switch (valorDeEscolha){
                case 1:
                    System.out.printf("""
                            Seu saldo atual é R$ %.2f
                            %n""", saldo);
                    break;
                case 2:

                    System.out.println("""
                            Digite o valor que será depositado:
                            """);
                    double valorDepositado = leitura.nextDouble();
                    saldo += valorDepositado;

                    System.out.printf("""
                                Agora seu saldo é de R$ %.2f
                                %n""", saldo);

                    break;
                case 3:
                    System.out.println("""
                            Digite o valor que será transferido:
                            """);
                    double valorDeTransferencia = leitura.nextDouble();

                    if(saldo < valorDeTransferencia){
                        System.out.println("""
                                Valor insuficiente para transferência, por favor tente outro valor
                                """);
                    } else {
                        saldo -= valorDeTransferencia;
                        System.out.printf("""
                                Agora seu saldo é de R$ %.2f
                                %n""", saldo);
                    }
                    break;
                case 4:
                    System.out.println("""
                            ************************************************************************
                            
                            Finalizado
                            
                            ************************************************************************
                            """);
                    break;
                default:
                    break;
            }
        }

    }

}
