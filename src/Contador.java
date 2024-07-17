import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        // Chamando o método contendo a lógica de contagem
        contar(parametroUm, parametroDois);

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) {
        // Validar se parametroUm é MAIOR que parametroDois e imprimir mensagem de erro
        if (parametroUm >= parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            return;
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}