public class Fibonacci1 {
    public static void fibonacci() {
        long suma = 0;
        long a = 0, b = 1;
        long siguiente;

        while (true) {
            siguiente = a + b;
            if (siguiente > 4_000_000) break;
            if (siguiente % 2 == 0) {
                suma += siguiente;
            }


            a = b;
            b = siguiente;
        }

        System.out.println("Suma: "+ suma);
    }
}