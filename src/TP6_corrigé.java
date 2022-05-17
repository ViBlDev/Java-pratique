import java.util.Scanner;
import java.util.HashMap;
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
//        Approche 1
//        mois.put(1,"janvier");
//        mois.put(2,"Fevrier");
//        mois.put(3,"Mars");
//        mois.put(4,"Avril");
//        mois.put(5,"Mai");
//        mois.put(6,"Juin");
//        mois.put(7,"Juillet");
//        mois.put(8,"Aout");
//        mois.put(9,"Septembre");
//        mois.put(10,"Octobre");
//        mois.put(11,"Novembre");
//        mois.put(12,"Decembre");

//        Approche 1
        String[] moisAnnee = {"janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet",
                "Aout", "Septembre", "Octobre", "Novembre", "Decembre"};

        for (int i = 0; i < moisAnnee.length; i++) {
            mois.put(i + 1, moisAnnee[i]);
        }

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mois : ");
        int valeurMois = clavier.nextInt();
//        System.out.println(mois);
        System.out.println(mois.get(valeurMois));
    }
}
