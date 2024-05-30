import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qualquer numero para fazer uma soma. quando quiser sair digite 0");
           int number = entrada.nextInt();

        int resultado = 0;
        while (number != 0) {
           
            resultado = resultado + number; 
            System.out.println(resultado);
            number = entrada.nextInt();
        }
        System.out.println("Resultado: "+resultado+" Fim da Execução");
    }
    
}
