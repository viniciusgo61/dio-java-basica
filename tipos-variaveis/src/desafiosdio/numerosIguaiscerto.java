/*
 * Desafio
Nesse desafio, dados dois números, verifique se eles são iguais. 
Caso sejam, retorne "Sao iguais!”. 
Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

Entrada
As entradas serão dois valores, um em cada linha, 
representados por A e B, que sempre serão números inteiros. 

Saída
A saída deverá retornar a frase "Sao iguais!"
 caso A e B sejam o mesmo valor. Caso contrário,  
 retorne "Nao sao iguais!", sem as aspas.
 */


package desafiosdio;

import java.util.Scanner;

public class numerosIguaiscerto {

    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      int A = leitor.nextInt();
      int B = leitor.nextInt();
      
      if (A == B){
        System.out.println("Sao Iguais!");
      }else{
        System.out.println("Nao Sao Iguais!");
      }

    }

}