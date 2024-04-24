//é a número 5 repetida
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int idadeMaior50 = 0;
		int somaIdade = 0;
		double somaAltura = 0;
		double mediaAltura = 0;
		double pesoMenor40 = 0;
		double porcentagem;
		
		for (int i = 1; i <= 3; i++){
		    System.out.println("Digite a idade da " + i + "ª pessoa:");
		    int idade = scanner.nextInt();
		    
		    System.out.println("Digite a altura da " + i + "ª pessoa:");
		    double altura = scanner.nextDouble();
		    
		    System.out.println("Digite o peso da " + i + "ª pessoa:");
		    double peso = scanner.nextDouble();
		    
	    if(idade >= 50){
	        idadeMaior50++;
	    }
	    
	    if(idade >= 10 && idade <= 20){
	        somaIdade++;
	        somaAltura += altura;
	    }
	    
	    if(peso <= 40){
	        pesoMenor40++;
	    }
	   
	    }
	    mediaAltura = somaAltura / somaIdade;
	    
	    porcentagem = pesoMenor40 / 3 * 100;
	    
	    System.out.println("Quantidade de pessoas com mais de 50 anos: " + idadeMaior50);
	    
	    System.out.println("Média da altura das pessoas entre 10 e 20 anos: " + mediaAltura);
	    
	    System.out.println("Porcentagem de pessoas com menos de 40 quilos: " + porcentagem);
	    
	}
}