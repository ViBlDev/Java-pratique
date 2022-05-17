import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
public class TP6_corrigé {
    /*
    Méthode 1

    public static void main(String[] args) {
           Scanner clavier=new Scanner(System.in);
           byte mois=clavier.nextByte();
           if(mois<0 || mois>12){
               System.out.printf("%d n'est pas un mois valide.",mois);
               System.exit(1);
           }
           switch (mois){
               case 1:
                   System.out.println("Janvier");
                   break;
               case 2:
                   System.out.println("Février");
                   break;
               case 3:
                   System.out.println("Mars");
                   break;
               case 4:
                   System.out.println("Avril");
                   break;
               case 5:
                   System.out.println("Mai");
                   break;
               case 6:
                   System.out.println("Juin");
                   break;
               case 7:
                   System.out.println("Juillet");
                   break;
               case 8:
                   System.out.println("Août");
                   break;
               case 9:
                   System.out.println("Septembre");
                   break;
               case 10:
                   System.out.println("Octobre");
                   break;
               case 11:
                   System.out.println("Novembre");
                   break;
               case 12:
                   System.out.println("Decembre");
                   break;
           }
       }
   }

   Méthode 2
   */
    public static void main(String[] args) {
        HashMap<Integer, String> mois = new HashMap<>();
//        Approche tableau 1
        mois.put(1, "janvier");
        mois.put(2, "Fevrier");
        mois.put(3, "Mars");
        mois.put(4, "Avril");
        mois.put(5, "Mai");
        mois.put(6, "Juin");
        mois.put(7, "Juillet");
        mois.put(8, "Aout");
        mois.put(9, "Septembre");
        mois.put(10, "Octobre");
        mois.put(11, "Novembre");
        mois.put(12, "Decembre");

//        Approche tableau 2
//        String[] moisAnnee={"janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet",
//                "Aout","Septembre","Octobre","Novembre","Decembre"};
//        String[] abc=new String[30];
//
//        for(int i=0;i<moisAnnee.length;i++){
//            mois.put(i+1,moisAnnee[i]);
//        }

        Scanner clavier = new Scanner(System.in);
        int valeurMois;

        while (true) {
            try {
                System.out.print("Entrez un mois : ");
                valeurMois = clavier.nextInt();
                if (valeurMois >= 1 && valeurMois <= 12) {//[1,12]
                    break;
                }
                System.out.println("Veuillez saisir une valeur entre 1 et 12");
            } catch (InputMismatchException e) {
                System.out.println("Veuiller entrer un nombre");
                clavier.nextLine();
            }

        }
        System.out.println(mois.get(valeurMois));
    }
}