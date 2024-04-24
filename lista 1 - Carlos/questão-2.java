import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float maior = 00;
		for (int i = 1; i <= 5; i++) {
		    System.out.print("Digite o " + i + "º número inteiro: ");
		    float numero = scanner.nextInt();
	   if (numero > maior) {
                maior = numero;	    
	    }
        }
    System.out.println("O maior dos números é: " + maior);
    }  
}