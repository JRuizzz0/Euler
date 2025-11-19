import java.util.Scanner;

public class Multiplos {

    public static void multiplos_3_5() {
        int suma = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;

            }
            System.out.println("Suma: " + suma);
        }
    }
}
