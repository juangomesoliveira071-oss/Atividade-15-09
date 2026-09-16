import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int ant = numero - 1;
        int sus = numero + 1;
        int dob = 2 * numero;
        int tri = 3 * numero;

        System.out.println("O número é: " + numero);
        System.out.println("O antecessor deste número é: " + ant);
        System.out.println("O sucessor deste número é: " + sus);
        System.out.println("O dobro deste número é: " + dob);
        System.out.println("O tríplo deste número é: " + tri);

    }

}
