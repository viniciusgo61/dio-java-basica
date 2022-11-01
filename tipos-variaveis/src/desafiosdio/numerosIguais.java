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

import java.util.*;
import java.util.Scanner;
class DoisNum{

   public void compara(int num1, int num2){

       if(num1 == num2) {

           System.out.println("Sao Iguais!");

       } else {

           System.out.println("Nao sao Iguais!");

       }

   }

}

public class numerosIguais {

     public static void main(String[] args){
        int num1;
        int num2;
        Scanner scan = new Scanner(System.in); //classe scaner
        System.out.println("digite um numero: ");
        num1 = scan.nextInt();
        System.out.println("digite um numero: ");
        num2 = scan.nextInt();

       DoisNum doisn = new DoisNum();  //instancia a classe

       doisn . compara(num1, num2);  //chama o método da classe

   }
}