import java.lang.Math;
public class TP5 {
    public static void solve(float a, float b, float c){

        float discriminant = (float) (Math.pow(b, 2) - 4*a*c);
        System.out.println(discriminant);

        if ( discriminant < 0){
            System.out.println("Désolé, pas solvable en réel");
        }
        else if (discriminant == 0){
            float x = - b / (2*a);
            System.out.println("Ta solution est simple, c'est " + x);
        }

        else if (discriminant > 0){
            float x1 = (float) ((-b -Math.sqrt(discriminant)) / (2*a));
            float x2 = (float) ((-b +Math.sqrt(discriminant)) / (2*a));
            System.out.println("t'as le choix, soit " + x1 + " , soit " + x2);
        }

        else {
            System.out.println("keuwah?");
        }
    }
}