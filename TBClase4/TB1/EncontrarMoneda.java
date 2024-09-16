package TBClase4.TB1;

import java.util.ArrayList;
import java.util.Arrays;

public class EncontrarMoneda {
    public static ArrayList CambioExacto(int[] cambio, int monto){
        cambio = Arrays.stream(cambio).sorted().toArray();
        ArrayList vuelto = new ArrayList();
        for (int i = cambio.length -1; i >= 0; i--){
            while (monto >= cambio[i]){
                monto -= cambio[i];
                vuelto.add(cambio[i]);
            }
        }
    return vuelto;
    }

    public static void main(String[] args) {
        int[] cambio = {1,5,25,50,100};
        int monto = 182;
        int resultado = 0;
        ArrayList s = CambioExacto(cambio,monto);
        for (int i = 0; i < s.size(); i++) {
            resultado = resultado + Integer.parseInt(s.get(i).toString());
        }
        System.out.println(monto);
        System.out.println(resultado);
    }
}
