import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainUsers {

    public static void main(String[] args) {

        ArrayList<Users> users = new ArrayList<>();
        users.add(new Users(UUID.randomUUID().toString(), "Lafont", "Cecile", "abcde@gmail.com", "motdepasse1"));
        users.add(new Users(UUID.randomUUID().toString(), "Bernard", "Alain", "ggtttt@gmail.com", "motdepasse2"));
        users.add(new Users(UUID.randomUUID().toString(), "Claret", "Ben", "ddffgg@gmail.com", "motdepasse3"));
        users.add(new Users(UUID.randomUUID().toString(), "Mout", "Julie", "lkjui@gmail.com", "motdepasse4"));
        users.add(new Users(UUID.randomUUID().toString(), "Nerou", "Valentin", "moiuy@gmail.com", "motdepasse5"));

        Scanner input = new Scanner(System.in);

        System.out.println("Souhaitez vous ajouter un nouvel utilisateur ?");
        String response = input.nextLine();

        if(response.equals("oui")){
            System.out.println("Nom : ");
            String lastname=input.nextLine();

        }

        int i = 0;

        while (i <= 2) {
            i++;
            System.out.println("Identifiant : ");
            String email = input.nextLine();

            System.out.println("Mot de passe : ");
            String mdp = input.nextLine();

            Validation.checkUser(users, email, mdp);
        }
        if (i == 3) {
            System.out.println("Trop de saisies erronées.");
        }
    }
}
