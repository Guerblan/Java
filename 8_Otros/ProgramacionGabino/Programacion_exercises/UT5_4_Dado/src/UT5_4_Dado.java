import java.util.Arrays;

public class UT5_4_Dado {
    public static void main(String[] args) throws Exception {
        int nCaras = 6;
        int modificador = 1;
        Dado dado = new Dado(nCaras, modificador);
        int [] resultados = new int[100];
        int suma = 0;
        //tirarDadoMod()
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = dado.tirarDadoMod();
            suma += resultados[i];
        }
        System.out.println(Arrays.toString(resultados));
        System.out.println(suma/resultados.length);
        //hacerTrampaMod()
        suma=0;
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = dado.hacerTrampaMod();
            suma += resultados[i];
        }
        System.out.println(Arrays.toString(resultados));
        System.out.println(suma/resultados.length);
    }
}
