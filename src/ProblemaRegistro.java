import java.util.Scanner;

public class ProblemaRegistro {
    public static void problemaregistro(){

        long suma = 0;

        for (int i = 1; i <= 234000; i++) {
            if (i % 2 != 0) {
                long cuadrado = (long) i * i;
                suma += cuadrado;
            }
        }

        System.out.println("Suma: " + suma);
    }
}