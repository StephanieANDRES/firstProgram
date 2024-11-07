import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class LePlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux nombres
        System.out.println("Saisir deux nombres entiers : ");
        int nombre1 = scanner.nextInt();
        int nombre2 = scanner.nextInt();

        // Déterminer le maximum
        int maximum = (nombre1 > nombre2) ? nombre1 : nombre2;

        // Afficher le résultat
        System.out.println("Le plus grand des deux est " + maximum);

        scanner.close();
    }
    
}
