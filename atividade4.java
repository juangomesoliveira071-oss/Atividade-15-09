import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.print("Segunda nota: ");
        double n2 = entrada.nextDouble();
        System.out.print("Terceira nota: ");
        double n3 = entrada.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }

}