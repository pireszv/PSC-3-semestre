public class Main
{
	public static void main(String[] args) {
	    System.out.println("Números entre 1000 e 2000 com resto 3 quando divididos por 5:");
        for (int numero = 1000; numero < 2000; numero++) {
                if (numero % 5 == 3) {
                System.out.println(numero);
                }
        }
	}
}