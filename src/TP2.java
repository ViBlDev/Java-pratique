import java.util.Scanner;

public class TP2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = null;
        String surname = null;
        int age = 0;

        System.out.print("Entrez votre prénom : ");
        name = scanner.nextLine();

        System.out.print("Entrez votre nom : ");
        surname = scanner.nextLine();

        System.out.print("Entrez votre age : ");
        age = scanner.nextInt();

        System.out.printf("Vous vous appelez %s %s et vous avez %d ans.", name, surname, age);
    }
}
