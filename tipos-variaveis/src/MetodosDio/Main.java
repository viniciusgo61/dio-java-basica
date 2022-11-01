package metodosdio;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Ex1Met.soma(3, 6);
        Ex1Met.subtracao(9, 1.8);
        Ex1Met.multiplicacao(7, 8);
        Ex1Met.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Ex3Mensagem.obterMensagem(9);
        Ex3Mensagem.obterMensagem(14);
        Ex3Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Ex2Emprestimo.calcular(1000, Ex2Emprestimo.getDuasParcelas());
        Ex2Emprestimo.calcular(1000, Ex2Emprestimo.getTresParcelas());
        Ex2Emprestimo.calcular(1000, 5);
    }
}
