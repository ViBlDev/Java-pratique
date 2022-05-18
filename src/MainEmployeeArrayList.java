import java.util.ArrayList;
import java.util.Scanner;

public class MainEmployeeArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Combien d'employés souhaitez-vous enregistrer?");
        int nombreEmployes = input.nextInt();

        ArrayList<Employe> employes = new ArrayList<>();
        int i;
        for (i = 0; i < nombreEmployes; i++) {
            System.out.println("Taille du tableau : " + employes.size());
            System.out.print("Id : ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Votre nom : ");
            String nom = input.nextLine();


            System.out.print("Votre prenom : ");
            String prenom = input.nextLine();
        }
    }
}
