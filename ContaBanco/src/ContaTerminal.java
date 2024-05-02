import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nPor favor ensira o numero da agência:");
        String numeroAgencia = scanner.next();

        System.out.println("\nAgora digite o número da conta:");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();
        System.out.println("\nDigite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("\nDigite o saldo:");
        Double saldo = scanner.nextDouble();


        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + numeroAgencia + ",\ncom numero de conta  " + numeroConta + ", e seu saldo de " + saldo + " já está disponível.\n ");
    }
}
