package TBClase1.Tb4;

public class Recursion {

    static int suma(int n){
        if (n == 0){
            return n;
        }
        return suma(n-1) + n;
    }

    public static void main(String[] args) {
        int n = 2;
        int total = suma(n);
        System.out.println("La suma de los resultados de " + n + " es " + total);
    }
}
