import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA EGIT");
        System.out.println("Escribe el primer número: ");
        int primerNumero = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe el segundo número: ");
        int segundoNumero = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe la operación a realizar (suma, resta): ");
        String funcionARealizar = sc.nextLine();

        if (funcionARealizar.matches("suma")) {
            System.out.println("La suma de " + primerNumero + " + " + segundoNumero + " es " + (primerNumero + segundoNumero));
        } else if (funcionARealizar.matches("resta")) {
            System.out.println("La resta de " + primerNumero + " - " + segundoNumero + " es " + (primerNumero - segundoNumero));
        }
    }
}