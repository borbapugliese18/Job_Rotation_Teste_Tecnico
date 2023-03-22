import java.util.Scanner;

public class InverterString {


    public static String inverterPalavra(String palavraDireta){
        String palavraInvertida = "";
        for(int c = palavraDireta.length() - 1;c >= 0;c--){
            palavraInvertida += palavraDireta.charAt(c);
        }
        return palavraInvertida;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.println("||          INVERTER PALAVRA         ||");
        System.out.println("---------------------------------------");
        System.out.print("Digite a palavra que deseja inverter: ");
        String palavraDireta = entrada.next();

        //Inverter a palavra
        System.out.println("Palavra invertida: "+inverterPalavra(palavraDireta));

    }
}
