package metodosdio;

/*
 * Criar uma aplicação que resolva as situações :
 * 1° calcule as 4 operações. sempre 2 valores devem ser passados.
 * 2° partir da hora do dia,informe a mensagem adequada.
 * 3°calcule o valor final de um empréstimo, a partir do valor solicitado. taxas e parcelam influenciam
 * Defina arbitrariamente as faixas que influenciam nos valores
 */

public class Ex1Met {
    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }
}
