import java.util.Random;
import java.util.Scanner;

public class GeneradorDni {

    private static final MyScanner sc = new MyScanner();
    private static final Scanner scc = new Scanner(System.in);
    private static final String Letras = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static void main(String[] args) {
        System.out.println("====== GENERADOR DE DNIs ======");

        int opcion = sc.pedirNumero("Introduce:\n1. Generar DNI\n2. Comprobar DNI\n3. Salir\n");

        if (opcion == 1) {
            System.out.println("DNI generado: " + generarDNI());
        } else if (opcion == 2) {
            System.out.println(comprobarDNI());
        } else {
            System.out.println("Gracias por tu tiempo!!");
        }
    }


    public static String generarDNI() {
        Random random = new Random();

        int numero = 10000000 + random.nextInt(90000000);
        char letra = Letras.charAt(numero % 23);

        return numero + String.valueOf(letra);
    }


    public static String comprobarDNI() {
        System.out.println("Introduce el DNI a comprobar: ");
        String DNI = scc.nextLine();

        if (DNI.length() != 9) {
            return "DNI inválido: longitud incorrecta.";
        }

        String parteNumerica = DNI.substring(0, 8);
        char letraIntroducida = DNI.charAt(8);


        if (parteNumerica.length() != 8) {
            return "DNI inválido: los primeros 8 caracteres deben ser números.";
        }

        for (char c : parteNumerica.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "DNI inválido: los primeros 8 caracteres deben ser números.";
            }
        }


        int numero = Integer.parseInt(parteNumerica);
        char letraCorrecta = Letras.charAt(numero % 23);

        if (letraCorrecta != letraIntroducida) {
            return "DNI inválido: la letra debería ser " + letraCorrecta;
        }

        return "DNI válido";
    }
}
