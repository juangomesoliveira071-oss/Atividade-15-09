import java.util.Scanner;

public class atividade11 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = entrada.nextDouble();
        System.out.print("Quantas aulas você faltou? ");
        double nft = entrada.nextDouble();
        System.out.print("Indique a sua situação financeira para com a faculdade: \n [1] Para regular \n [2] Para irregular");
        double fin = entrada.nextDouble();

        double qa = 20.0;

        double med = (n1 + n2 + n3) / 3;
        double fre = ((qa - nft) / qa) * 100;

        // 1. Situação em que o aluno cumpriu todos os requisitos.
        boolean sit1 = (med >= 7) && (fre >= 75) && (fin == 1);

        // 2. Situação em que o aluno reprovou por media e frequencia.
        boolean sit2 = !((med >= 7) && (fre >= 75));

        // 3. Situação em que o aulo reprovou por media e situ. financeira.
        boolean sit3 = !((med >= 7) && (fin == 1));

        // 4. Situação em que o aluno foi reprovado por frequencia e situ. financeira.
        boolean sit4 = !((fre >= 75) && (fin == 1));

        // 5. Situação em que o aluno foi reprovado por media.
        boolean sit5 = !(med >= 7);

        // 6. Situação em que o aluno foi reprovado por frequencia.
        boolean sit6 = !(fre >= 75);

        // 7. Situação em que o aluno foi reprovado por situ. financeira.
        boolean sit7 = !(fin == 1);

        if (sit1 == true) {
            System.out.print("Parabéns, você foi aprovado!");
        }
        else if (sit1 == false) {
            System.out.print("Infelizmente você reprovou pois sua média ficou a baixo de 7.00, sua frequencia foi menor que 75% e sua situação financeira esta irregular!");
        }
        else if (sit2 == true) {
            System.out.print("Infelizmente você reprovou pois sua média ficou a baixo de 7.00 e sua frequencia foi menor que 75%!");
        }
        else if (sit3 == true) {
            System.out.print("Infelizmente você reprovou pois sua média ficou a baixo de 7.00 e sua situação financeira esta irregular!");
        }
        else if (sit4 == true) {
            System.out.print("Infelizmente você reprovou pois sua situação financeira esta irregular e sua frequencia foi menor que 75%!");
        }
        else if (sit5 == true) {
            System.out.print("Infelizmente você reprovou pois sua média ficou a baixo de 7.00!");
        }
        else if (sit6 == true) {
            System.out.print("Infelizmente você reprovou pois sua frequencia foi menor que 75%!");
        }
        else if (sit2 == true) {
            System.out.print("Infelizmente você reprovou pois sua situação financeira esta irregular!");
        }
    }
    
}
