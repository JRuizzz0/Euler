public class Factorizacion1 {

    public static void factorizacion1() {
        long numero = 600851475143L;
        long divisor = 2;

        System.out.println("Factores primos de " + numero + ":");

        while (numero > 1) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
                numero = numero / divisor;
            } else {
                divisor++;
            }
        }
    }
}