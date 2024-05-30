import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) {
        
       Scanner enter = new Scanner(System.in);

       // Quando nao sabemos exatamente quantas vezes o laço deve ser repetido, usamos o while;

       System.out.println("Digite seu nome completo: e depois 'S' para sair");
       String nome = enter.nextLine();

       // O teste deve ser feito antes de iniciar uma execução de um bloco de comandos;

       while (!nome.equals("S")) {
        System.out.println("Seja bem vindo "+ nome);
        nome= enter.nextLine();// Linha de comando para que o loop nao seja infinito;
       }
            System.out.println("Fim da execuçao");
        }

    }


