import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();

        if (n1 == n2) {
            System.out.println("Os dois número são iguais!");
        } else if (n1 < n2) {
            System.out.println(n2 + " é maior!");
        } else if (n1 > n2) {
            System.out.println(n1 + " é maior!");
        }
    }

}
