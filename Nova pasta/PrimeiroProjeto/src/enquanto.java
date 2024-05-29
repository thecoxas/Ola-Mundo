import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        
       Scanner enter = new Scanner(System.in);
       System.out.println("Digite seu nome completo: e depois 'S' para sair");
       String nome = enter.nextLine();
       while (!nome.equals("S")) {
        System.out.println("Seja bem vindo "+ nome);
        nome= enter.nextLine();
       }
            System.out.println("Fim da execuçao");
        }

    }


