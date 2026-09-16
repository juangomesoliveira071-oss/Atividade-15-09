import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int resto = numero % 2;

        if (resto == 1) {
            System.out.println("Este número é impar!");
        } else if (resto == 0) {
            System.out.println("Este número é par!");
        }
    }

}
