import java.util.Scanner;

public class TP3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a = 0;
        long b = 0;
        long c = 0;

        System.out.print("Assignez une valeur au nombre a : ");
        a = scanner.nextInt();

        System.out.print("Assignez une valeur au nombre b : ");
        b = scanner.nextInt();

        System.out.print("Assignez une valeur au nombre c : ");
        c = scanner.nextInt();

        System.out.print("Les valeurs entrées sont a = " + a + " b = " + b + " c = " + c);

        long tmp1 = 0;
        long tmp2 = 0;
        long tmp3 = 0;

        tmp1 = a;
        tmp2 = b;
        tmp3 = c;

        a = tmp3;
        b = tmp1;
        c = tmp2;


        System.out.print("Les valeurs permutées sont : a = " + a + " b = " + b + " c = " + c);

    }
}