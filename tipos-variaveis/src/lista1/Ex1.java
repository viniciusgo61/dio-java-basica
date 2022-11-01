package lista1;
import java.util.Scanner;
	// Ler um número e se ele for maior do que 20, então imprimir a metade do
	// número.

public class Ex1 {
    Scanner input = new Scanner(System.in);
	int numero = 0;

    System.out.println("Digite um numero :");
    numero=input.nextInt();

    if (numero>20){
        System.out.println("Metade de numero: " + numero / 2);
		} else {
			System.out.println("Numero completo: " + numero);
		}
    
}
