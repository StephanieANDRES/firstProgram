//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CastDemo {
    public static void main(String[] args) {
        // Conversion implicite
        int nombreEntier = 10;
        double nombreFlottant = nombreEntier;

        System.out.println("Nombre flottant : " + nombreFlottant);

        // Conversion explicite
        double valeurFlottante = 8.75;
        int valeurEntiere = (int) valeurFlottante;

        System.out.println("Nombre entier : " + valeurEntiere); // Affiche 8

    }
}