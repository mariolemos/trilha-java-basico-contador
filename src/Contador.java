import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();


        System.out.println("Primeiro parâmetro: " + parametroUm);
        System.out.println("Segundo parâmetro: " + parametroDois);

    }
}