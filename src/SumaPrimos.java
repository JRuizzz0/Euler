public class SumaPrimos {
   public static void sumaPrimos () {
        long suma = 0;

        for (int i = 2; i <= 2000000; i++) {
            if (esPrimo(i)) {
               suma = suma + i;
            }
            System.out.println(suma);
        }

    }

    public static boolean esPrimo(int n) {

        if (n == 2) {
            return true;
        }
        if (n % 2 == 0 || n < 2) {
            return false;
        }

        for (int i = 3; i * i <= n; i+=2) {
            if (n % i == 0 && i != n) {
                return false;
            }

        }
        return true;
    }

}









