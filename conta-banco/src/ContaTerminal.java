import java.util.Scanner;

public class ContaTerminal { 
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Olá cliente digite o número da sua Agência: ");
        int numero = scanner.nextInt();

        System.out.println("Agora digite a Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Agora digite seu primeiro nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Agora digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
