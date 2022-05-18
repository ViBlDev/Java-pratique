import java.util.Scanner;
import java.util.UUID;

public class TP1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int diameter;
        float rayon;
        double surface;

        System.out.print("Saisir un diamètre : ");
        diameter = scanner.nextInt();

        rayon = diameter/2;
        surface = (rayon * rayon) * Math.PI;

        System.out.print("surface : " + surface);
    }
}
