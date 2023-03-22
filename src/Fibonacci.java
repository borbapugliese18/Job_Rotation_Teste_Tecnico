import java.util.Scanner;

public class Fibonacci {

    public static boolean verificaFibonacci(int numero){
        int a=0,b=1,aux=0;

        if(numero == 0 || numero == 1){
           return true;
        }

        while(a <= numero){
            aux= a+b;
            a=b;
            b=aux;
            if(numero == a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        System.out.println("---------------------------------");
        System.out.println("     VERIFICAÇÃO DE FIBONACCI    ");
        System.out.println("---------------------------------");
        System.out.print("Digite um número para verificação: ");
        numero = entrada.nextInt();

        //Verificação de erros
        while(numero < 0){
            System.out.println("[ERRO] - Número menor que zero!");
            System.out.println("Digite novamente: ");
            numero = entrada.nextInt();
        }

        //Saída
        if(verificaFibonacci(numero)){
            System.out.println("- BOA! -Número pertence a sequência!");
        }else{
            System.out.println("- NÃO FOI DESSA VEZ - Número não pertence a sequência...");
        }


    }
}
