import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        double largura = entrada.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        System.out.println("A área é: " + area);
        System.out.println("O perimetro é: " + perimetro);
    }

}
