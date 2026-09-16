import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        int proximo = idade + 1;

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("No próximo ano você terá: " + proximo);

    }

}
