import java.util.Scanner;

public class atividade12 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print ("Qual o valor da comra? ");
        float val = entrada.nextFloat();
        
        if (val <= 100) {
            System.out.println ("Sua compra não atingiu o valor necessário para ganhar desconto!");
        }
        else if (val > 500) {
            System.out.println("Parabéns!! Você conseguiu um desconto de 20%. Sua compra no valor de " + val + " ganhou um desconto de  " + (val * (20 / 100.0)) + " Você vai pagar apenas " + (val - (val * (20.0 / 100.0))) + "!");
        }
        else if ((val >= 100.01) && (val <= 500)) {
            System.out.println("Parabéns!! Você conseguiu um desconto de 10%. Sua compra no valor de " + val + " ganhou um desconto de  " + (val * (10 / 100.0)) + " Você vai pagar apenas " + (val - (val * (10.0 / 100.0))) + "!");
        }


    }
    
}
