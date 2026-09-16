import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("Este número é positivo!");
        } else if (numero < 0) {
            System.out.println("Este número é negativo!");
        } else if (numero == 0) {
            System.out.println("O número é 0!");
        }
    }

}
