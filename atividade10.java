import java.util.Scanner;
// Gostaria de esclarecer que foi usado IA neste código,
// no entanto foi usada apenas como ferramenta para agilizar os processos repetitivos.
// Toda a logica foi pensada por mim e foi solicitado para gerar as linhas que testassem as
// situações com base na primeira linha que eu escrevi.
public class atividade10 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = entrada.nextInt();

        // 1. n1 é o maior E n2 é o menor
        boolean sit1 = (n1 > n2 && n1 > n3) && (n2 < n1 && n2 < n3);

        // 2. n1 é o maior E n3 é o menor
        boolean sit2 = (n1 > n2 && n1 > n3) && (n3 < n1 && n3 < n2);

        // 3. n2 é o maior E n1 é o menor
        boolean sit3 = (n2 > n1 && n2 > n3) && (n1 < n2 && n1 < n3);

        // 4. n2 é o maior E n3 é o menor
        boolean sit4 = (n2 > n1 && n2 > n3) && (n3 < n1 && n3 < n2);

        // 5. n3 é o maior E n1 é o menor
        boolean sit5 = (n3 > n1 && n3 > n2) && (n1 < n2 && n1 < n3);

        // 6. n3 é o maior E n2 é o menor
        boolean sit6 = (n3 > n1 && n3 > n2) && (n2 < n1 && n2 < n3);

        // 7. n1 ser igual an2
        boolean sit7 = (n1 == n2);

        // 8. n1 ser igual an3
        boolean sit8 = (n1 == n3);

        // 9. n3 ser igual an2
        boolean sit9 = (n3 == n2);

        boolean sit10 = ((n3 == n2) && (n3 == n1));


        if (sit1 == true) {
            System.out.print(n1 + " é maior e " + n2 + " é menor");
        }
        else if (sit2 == true) {
            System.out.print(n1 + " é maior e " + n3 + " é menor");
        }
        else if (sit3 == true) {
            System.out.print(n2 + " é maior e " + n1 + " é menor");
        }
        else if (sit4 == true) {
            System.out.print(n2 + " é maior e " + n3 + " é menor");
        }
        else if (sit5 == true) {
            System.out.print(n3 + " é maior e " + n1 + " é menor");
        }
        else if (sit6 == true) {
            System.out.print(n3 + " é maior e " + n2 + " é menor");
        }
        else if (sit10 == true) {
            System.out.print("Os três números são iguais!");
        }
        else if (sit7 == true) {
            System.out.print("O primeiro e o segundo número são iguais!");
        }
        else if (sit8 == true) {
            System.out.print("O primeiro e o terceiro número são iguais!");
        }
        else if (sit9 == true) {
            System.out.print("O terceiro e o segundo número são iguais!");
        }

    }
    
}
