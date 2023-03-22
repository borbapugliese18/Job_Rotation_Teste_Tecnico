import java.text.DecimalFormat;

public class FaturamentoMensalEstados {

    public static double[] calculoPercentual(double[] vetorFatEstados){
        double[] porcentagemEstados = new double[5];
        double somaFatEstados=0;

        for(int i=0;i<5;i++){
            somaFatEstados += vetorFatEstados[i];
        }
        for(int c=0;c<5;c++){
            porcentagemEstados[c] = (vetorFatEstados[c] / somaFatEstados);
        }

        return porcentagemEstados;
    }
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,##0.00%");

        String vetorNomeEstados[] = new String[]{"SP", "RJ", "MG", "ES", "Outros"};
        double vetorFaturamentoEstados[] = new double[]{67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        //Percentual de representação de cada estado
        double vetPorcentagem[] = calculoPercentual(vetorFaturamentoEstados);
        for(int i=0;i<5;i++){
            System.out.println(vetorNomeEstados[i]+" - "+ format.format(vetPorcentagem[i]));
        }




    }
}
