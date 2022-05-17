import java.util.Scanner;

public class TP3_corrigé {

    public static void numberCheck() {
        int a,b,c,d;

        Scanner scanner = new Scanner(System.in);
        System.out.println("a ?");
        a = scanner.nextInt();

        System.out.println("b ?");
        b = scanner.nextInt();

        System.out.println("c ?");
        c = scanner.nextInt();

        d=b;
        b=a;
        a=d;

        System.out.println("a = "+a+". b = "+b+". c = "+c);

    }
}
