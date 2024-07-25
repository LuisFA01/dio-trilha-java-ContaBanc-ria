import java.util.Scanner;

public class Conta_Terminal1 {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o número da conta:");
        int numero = input.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = input.next();

        input.nextLine();

        System.out.println("Por favor, informe seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Informe o valor para saque:");
        Double saldo = input.nextDouble();

        System.out.println( "Olá " + (nomeCliente) +  " obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia + " ,conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );

      
    }
}
