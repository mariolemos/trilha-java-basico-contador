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

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println("Erro ao digitar parametros: " + exception.getMessage());

        }
    }

    static void contar(int parametroUm, int parametrodois) throws ParametrosInvalidosException {
        if(parametrodois < parametroUm) {
            throw  new ParametrosInvalidosException("O Segundo parametro tem que ser maior que o Primeiro");
        }
        int contagem = parametrodois - parametroUm;
        for(int i = 0 ; i<contagem ; i++){
            System.out.println(i+1);
        }
    }
}