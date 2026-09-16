import java.util.Scanner;

public class atividade9 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Qual a sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.print("Você é uma criança!");
        }
        else if (idade >= 13 && idade <= 17) {
            System.out.print("Você é um adolecente!");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.print("Você é um adulto!");           
        }
        else if (idade >= 100) {
            System.out.print("Você esta só a capa do batman!");
        }
        else if (idade >= 60) {
            System.out.print("Você é um idoso!");
        }
        
    }
    
}
