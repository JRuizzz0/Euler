import java.util.Random;

public class TheChase {
    static int jugadores = 100;
    static final Random rand = new Random();

    public static void main(String[] args) {

        long simulaciones = 1000000000000000L;
        double suma = 0.0;

        for (int i = 1; i <= simulaciones; i++) {
            suma += juegoSimulado();
        }

        double media = suma / simulaciones;
        System.out.println("Media de rondas: " + media);
    }

    public static long juegoSimulado() {

        int dado1 = 0;
        int dado2 = jugadores / 2;
        long turno = 0;

        while (true) {
            turno++;

            int movimiento1 = movimiento(dado1);
            int movimiento2 = movimiento(dado2);

            dado1 = movimiento1;
            dado2 = movimiento2;

            if (dado1 == dado2) {
                return turno;
            }
        }
    }

    public static int movimiento(int posicion) {
        int l = rand.nextInt(6) + 1;

        if (l == 1) {
            return (posicion - 1 + jugadores) % jugadores;
        } else if (l == 6) {
            return (posicion + 1) % jugadores;
        } else {
            return posicion;
        }
    }
}
