import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite a Agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome: ");
        scanner.nextLine();
        String nomecliente = scanner.nextLine();

        System.out.println("Ola " + nomecliente +", obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia +", conta "+numero+ " e seu saldo "+saldo+ " ja esta disponivel para saque.");
    }
}
