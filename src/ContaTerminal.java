import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: "Conhecer e importar a classe Scanner

        //Exibir as mensagens para os usuários

        //Obter pela classe scanner os valores digitados no terminal.

        // Exibir a mensagem Conta Criada

        int NumeroConta;
        String Cliente, Agencia;
        Double Saldo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Número da Conta: ");
        NumeroConta = sc.nextInt();

        System.out.println("Digite o número da Agência: ");
        Agencia = sc.next();

        System.out.println("Digite seu Nome: ");
        sc.nextLine();
        Cliente = sc.nextLine();


        System.out.println("Digite seu Saldo: ");
        Saldo = sc.nextDouble();

        System.out.println("Olá " + Cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo " + Saldo + " já está disponível para saque.");

        sc.close();
    }
}