import java.util.Scanner;

public class TP4_corrigé {
    public static void main(String[] args) {
    /*    Scanner clavier=new Scanner(System.in);
        byte nombre=clavier.nextByte();
        boolean estPair=nombre%2==0;//true

        String resultat="";
       if(estPair){
           resultat="pair";
       }else{
           resultat="impair";
       }

       String resultat2=estPair?"pair":"impair";

        if(nombre>0){
            System.out.printf("%d est positif et %s",nombre,(estPair?"pair":"impair"));
           System.out.printf("%d est positif et %s",resultat);
           System.out.printf("%d est positif et %s",resultat2);
        }else if(nombre<0){
            System.out.printf("%d est négatif et %s",nombre,(estPair?"pair":"impair"));
        }else{
            System.out.println("0 et pair");
        }
    }
}
*/
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.print("Entrez votre nombre : ");
        value = scanner.nextInt();
        scanner.close();
        if (value == 0) {
            System.out.println("Le nombre est Zéro. Il est donc pair.");
        } else if (value > 0 && value % 2 == 0) {
            System.out.println("Le nombre est positif et pair.");
        } else if (value < 0 && value % 2 == 0) {
            System.out.println("Le nombre est négatif et pair.");
        } else if (value > 0 && value / value != 0) {
            System.out.println("Le nombre est positif et impair.");
        } else if (value < 0 && value / value != 0) {
            System.out.println("Le nombre est négatif et impair.");
        }
    }
}