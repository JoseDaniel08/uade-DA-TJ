package TBClase1.Tb3;
import java.math.BigInteger;

public class main {
    public static void main(String[] args) {

                long num1 = 9223372036854775807L;
                long num2 = 1000000l;
                long sumaLong = num1 + num2;

                System.out.println("Suma con long (overflow): " + sumaLong);

                // Usando BigInteger para evitar overflow
                BigInteger bigNum1 = new BigInteger("9223372036854775807");
                BigInteger bigNum2 = new BigInteger("1000000");
                BigInteger sumaBig = bigNum1.add(bigNum2);

                System.out.println("Suma con BigInteger: " + sumaBig);


    }
}
