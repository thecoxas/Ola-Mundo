import java.util.Scanner;

public class maiorQue100 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número maior que 100");
        int numero = entrada.nextInt();
        while (numero <= 100) {
            System.out.println("Número invalido: digite novamente");
            numero = entrada.nextInt();
            
        }
        System.out.println("Sucesso seu numero foi arquivado");
    }
}
