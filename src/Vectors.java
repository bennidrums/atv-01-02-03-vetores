import java.util.Scanner;

public class Vectors {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n======================");
            System.out.println("        MENU");
            System.out.println("======================\n");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    exercicio1(sc);
                    break;
                case 2:
                    exercicio2(sc);
                    break;
                case 3:
                    exercicio3(sc);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }


    public static void exercicio1(Scanner sc) {

        int quant;
        System.out.println("\n--- EXERCÍCIO 1 ---\n");
        System.out.println("Quantos números deseja inserir?");
        quant = sc.nextInt();
        int[] vetor = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }
        for (int passagem = 0; passagem < quant; passagem++) {

            for (int i = 0; i < quant - 1; i++) {

                if (vetor[i] > vetor[i + 1]) {
                    int temporario = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temporario;
                }
            }
        }
        System.out.print("Vetores de forma ordenada: ");
        for (int i = 0; i < quant; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
    }


    public static void exercicio2(Scanner sc) {

        int quantidade;
        System.out.println("\n--- EXERCÍCIO 2 ---\n");
        System.out.println("Quantos números deseja inserir?");
        quantidade = sc.nextInt();

        int[] vetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);
            }
        }
        System.out.println("Novo vetor após a alteração:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
    }


    public static void exercicio3(Scanner sc) {

        System.out.println("\n--- EXERCÍCIO 3 ---\n");
        System.out.print("Escreva uma palavra: ");
        String nome = sc.nextLine();

        for (int i = nome.length() - 1; i >= 0; i--) {
            char letra = nome.charAt(i);
            System.out.print(letra);
        }
        System.out.println("\n");
    }
}