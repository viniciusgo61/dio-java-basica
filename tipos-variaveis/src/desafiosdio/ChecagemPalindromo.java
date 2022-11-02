/*
 * Desafio
Neste desafio você deverá construir uma função que 
recebe uma String e identifique se a mesma é um palíndromo,
 ou seja, se a String é igual a ela mesma invertida. 

Dado que temos a String "digital" uma vez invertida temos 
"latigid" que são diferentes. 

Logo, NÃO é um Palíndromo. 

Já se recebemos a string "radar" uma vez invertida 
temos "radar" que são iguais.

Entrada
A entrada consiste em um palavra.

Saída
Para cada String informada, terá uma saída de valor 
Booleano: TRUE, caso a palavra seja um palíndromo, 
ou FALSE caso a palavra NÃO seja um palíndromo.

Exemplos de Entrada	Exemplos de Saída
radar                  TRUE
digital	                FALSE
ana	                    TRUE
 */


package desafiosdio;
import java.util.Scanner;
public class ChecagemPalindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine();

        String novaPalavra = "";
        String[] letras = palavra.split("");
        for (int i = letras.length-1; i >= 0; i--){
            novaPalavra = novaPalavra + letras[i];
        }

        System.out.println(novaPalavra.equals(palavra)?"TRUE":"FALSE");
    }
}
