import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int somaIdade = 0;
		int pesoMaiorQue90kg = 0;
		for (int i = 1; i <= 7; i++) {
		    
		    System.out.print("Digite a idade da " + i + "ª pessoa: ");
		    int idade = scanner.nextInt();
		    somaIdade += idade;
		    
		    System.out.print("Digite o peso da " + i + "ª pessoa: ");
		    int peso = scanner.nextInt();
		    
	            if (peso > 90) {
	                pesoMaiorQue90kg++;
	            }
	    }
    System.out.println("Total de pessoas acima dos 90 kg: " + pesoMaiorQue90kg);
    
    double media = somaIdade / 7.0;
    
    System.out.println("A média de idade das pessoas é " + media);
	}
}