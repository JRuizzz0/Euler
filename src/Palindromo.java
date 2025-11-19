public class Palindromo {
    public static void palindromo1(){
    int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int producto = i * j;
                if (esPalindromo(producto) && producto > max) {
                    max = producto;
                }
            }
        }
        System.out.println("El palíndromo más grande es: " + max);
    }

    public static boolean esPalindromo(int n) {
        String str = String.valueOf(n);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}