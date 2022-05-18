import java.util.Arrays;
import java.util.Scanner;

public class MainEmploye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Combien d'employés souhaitez-vous enregistrer?");
        int nombreEmployes = input.nextInt();

        Employe[] employes = new Employe[nombreEmployes];
        employes[0] = new Employe(1, "Christian", "Lisangola");

        for (int i = 0; i < employes.length; i++) {
            System.out.print("Id : ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Votre nom : ");
            String nom = input.nextLine();


            System.out.print("Votre prenom : ");
            String prenom = input.nextLine();

//            Employe employe=new Employe(id,prenom,nom);
//            employes[i]=employe;

            employes[i] = new Employe(id, prenom, nom);
        }


//        Affichage de tous les employés
        System.out.println(Arrays.toString(employes));


//        Affichage de chaque employé de manière individuelle : Mauvaise pratique
//        System.out.println("Employé[0] : "+employes[0]);
//        System.out.println("Employé[1] : "+employes[1]);

        //        Affichage de chaque employé de manière individuelle : Bonne pratique

        for (int i = 0; i < employes.length; i++) {
//            System.out.println("Employé["+i+"] : "+employes[i]);
            System.out.println("Employé[" + i + "] : " + employes[i].getLastName());
        }

//        String[] fruits=new String[3];
//        fruits[0]="pommes";
//        fruits[1]="bananes";
//        fruits[2]="oranges";
//
//        System.out.println(Arrays.toString(fruits));

//        Employe chris=new Employe(3,"Jean","Zozor");
//        System.out.println(chris);
    }
}