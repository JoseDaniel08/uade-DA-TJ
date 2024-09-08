package TBClase1.Tb1;

public class main {

    static boolean CombinacionON(int[][] math){

        int suma = 0;
        int n = math.length;
        int totalconbinaciones = (int) Math.pow(2,n);

        for(int i = 0; i < math.length; i++){
            for(int j = 0; j < math[i].length; j++){
                suma += math[i][j];
            }
        }
        if (totalconbinaciones == suma){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[][] math = {{4,5,6},{7,8,9},{5,6,7}};
        System.out.println("¿Existe una combinacion? " + "Es: " + CombinacionON(math));

    }


}
