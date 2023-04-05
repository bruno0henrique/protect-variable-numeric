import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num;
        do {
            System.out.print("Digite um número positivo: ");
            while (!ler.hasNextDouble()) {//funciona enquanto não houver um double válido
                System.out.println("Entrada inválida! Digite novamente: ");
                ler.next(); //next pois tem que descartar x entrada anterior
            }
            num = ler.nextDouble();
        } while (num <= 0);
        ler.close();
    }
}