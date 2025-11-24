import java.sql.SQLOutput;

public class Pitagoras {
    public static void pitagoras() {
        int suma = 1000;

        for(int a = 1; a <= suma/3; a++){
            for (int b = 1; b <= suma/2; b++){
               int c = suma - b -a;
               if (a*a + b*b == c*c){
                   System.out.println(a);
                   System.out.println(b);
                   System.out.println(c);

                   System.out.println(a*b*c);

               }
            }

        }



    }






}
