import java.util.Scanner;

public class atividade13 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o nome de usuário: ");
        String adm = entrada.nextLine();
        System.out.println("Digite sua senha: ");
        String sen = entrada.nextLine();

        if (adm.equals("admin") && sen.equals("1234")) {
            System.out.println ("Login realizado com sucesso!");
        }
        else {System.out.println("Usuário ou senha incorretos.");

        }

    }
    
}