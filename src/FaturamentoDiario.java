import java.text.DecimalFormat;

public class FaturamentoDiario {
    public static double maiorFaturamento(double[] vetorFat){
        int c=0;
        double maior=0;

        while(c < vetorFat.length){
            if(c==0){
                maior = vetorFat[c];
            }
            if(vetorFat[c] > maior){
                maior = vetorFat[c];
            }
            c++;
        }

        return maior;
    }
    public static double menorFaturamento(double[] vetorFat){
        double menor=0;
        for(int c=0;c < vetorFat.length;c++){
            if(c==0){
                menor = vetorFat[c];
            }

            //(ANALISEI O MENOR FATURAMENTO SEM SER NOS DIAS EM QUE NÃO HÁ FATURAMENTO)
            //CASO QUEIRA FAZER A ANALISE DO MENOR FATURAMENTO CONTANDO OS DIAS QUE NÃO HÁ FATURAMENTO, TIRE A EXPRESSÃO:  vetorFat[c] != 0 &&)
            if(vetorFat[c] != 0 && vetorFat[c] < menor){
                menor = vetorFat[c];
            }
        }

        return menor;
    }

    public static int numeroDias(double[] vetorFat){
        int c=0,contadorMedia=0;
        int numeroDias=0;
        double mediaFaturamento=0, somaFat=0;
        while(c < vetorFat.length){
            if(vetorFat[c] != 0){
                contadorMedia++;
                somaFat += vetorFat[c];
            }
            c++;
        }
        mediaFaturamento = somaFat/contadorMedia;

        for(int i=0;i<vetorFat.length;i++){
            if(mediaFaturamento < vetorFat[i]){
                numeroDias++;
            }
        }

        return numeroDias;
    }

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("R$ #,##0.00");

        double[] vetorFaturamento = new double[]{22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722,
        0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025,
        0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};


        //O menor valor de faturamento
        System.out.println("Menor faturamento: "+format.format(menorFaturamento(vetorFaturamento)));

        //O maior valor de faturamento
        System.out.println("Maior faturamento: "+format.format(maiorFaturamento(vetorFaturamento)));

        //Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
        System.out.println("Dias em que o faturamento diário é superior à média mensal: "+numeroDias(vetorFaturamento));




    }
}
