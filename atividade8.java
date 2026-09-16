import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();
        System.out.print("Qual a operação desejada:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
        int op = entrada.nextInt();

        double som = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        double div = n1 / n2;

        if (op == 1) {
            System.out.print("O resultado é: " + som);
        }
        else if (op == 2) {
            System.out.print("O resultado é: " + sub);
        }
        else if (op == 3) {
            System.out.print("O resultado é: " + mul);
        }
        else if (op == 4) {
            System.out.print("O resultado é: " + div);
        }

    }

}
