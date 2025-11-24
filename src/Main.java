public class Main {

    private static final MyScanner sc = new MyScanner();

    public static void main(String[] args) {

        System.out.println("======= MENU DE EJERCICIOS =======");
        System.out.println("1. ProblemaRegistro");
        System.out.println("2. Multiplos de 3 y 5 menor 1000");
        System.out.println("3. Fibonacci ejercicio 1");
        System.out.println("4. Factorización número primo");
        System.out.println("5. Palíndromo");
        System.out.println("6. Pitágoras");
        System.out.println("7. Suma Primos");
        System.out.println("8. Numeros diagonales");

        int ejercicio = sc.pedirNumero("Introduce el numero delo ejercicio: ");

        switch (ejercicio) {
            case 1:
                ProblemaRegistro problema = new ProblemaRegistro();
                problema.problemaregistro();
                break;

            case 2:
                Multiplos multiplos = new Multiplos();
                multiplos.multiplos_3_5();
                break;

            case 3:
                Fibonacci1 fibonacci1 = new Fibonacci1();
                fibonacci1.fibonacci();
                break;
            case 4:
                Factorizacion1 factorizacion = new Factorizacion1();
                factorizacion.factorizacion1();
                break;
            case 5:
                Palindromo palindromo = new Palindromo();
                palindromo.palindromo1();
                break;

            case 6:
                Pitagoras pitagoras = new Pitagoras();
                pitagoras.pitagoras();
                break;
            case 7:
                SumaPrimos sumaPrimos = new SumaPrimos();
                sumaPrimos.sumaPrimos();
                break;

            case 8:
                NumerosDiagonales numerosDiagonales = new NumerosDiagonales();
                numerosDiagonales.numerosDiagonales();
                break;

        }
    }

}
