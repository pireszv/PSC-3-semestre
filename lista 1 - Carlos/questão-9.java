import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        System.out.println(numero + "! = " + resultado);
        
	}
}