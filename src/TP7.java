import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choisissez une adresse e-mail : ");
        String email = scanner.nextLine();

        System.out.print("Choisissez un mot de passe : ");
        String password = scanner.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Veuillez entrer votre identifiant");
            String email2 = scanner.nextLine();
            System.out.println("Veuillez entrer votre password");
            String password2 = scanner.nextLine();
            if (i == 5) {
                System.out.println("Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué");
            }
            if (email2.equals(email) && password2.equals(password)) {
                System.out.println("Bienvenue dans votre espace client");
                break;
            } else {
                System.out.println("Identifiants incorrects, il vous reste " + (5 - i) + " essais.");
            }
        }
    }
}
