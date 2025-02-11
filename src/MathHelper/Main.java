package MathHelper;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("============================");
        System.out.println("=           Menu:          =");
        System.out.println("============================");
        System.out.println("= 1- Próximo Número        =");
        System.out.println("= 2- Juntar nome e apelido =");
        System.out.println("= 3- Maior Número          =");
        System.out.println("= 4- Soma dos Números      =");
        System.out.println("= 5- Média dos Números     =");
        System.out.println("= 0- Sair                  =");
        System.out.println("============================");
        System.out.println("Escolhe uma opção: ");
    }

    public static void main(String[] args) {
        int escolha;
        int numero;
        String nome;
        String apelido;
        String juntarnomes;
        int sairmesmo = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            menu(); // menu
            escolha = scanner.nextInt();
            scanner.nextLine(); // Para consumir o \n

            switch (escolha) {
                case 1:
                    System.out.println("Introduz um número: ");
                    numero = scanner.nextInt();
                    numero = MathHelper.numeroSeguinte(numero);
                    System.out.println("A resposta é: " + numero);
                    break;

                case 2:
                    System.out.println("Introduz um Nome: ");
                    nome = scanner.nextLine();

                    System.out.println("Introduz um Apelido: ");
                    apelido = scanner.nextLine();

                    juntarnomes = MathHelper.juntarNome(nome, apelido);

                    System.out.println("O nome completo é: " + juntarnomes);
                    break;

                case 3:
                    System.out.println("Quantos números queres introduzir?");
                    int n = scanner.nextInt();
                    int[] numeros = new int[n];
                    System.out.println("Introduz os números:");

                    for (int i = 0; i < n; i++) {
                        numeros[i] = scanner.nextInt();
                    }

                    int maiorNumero = MathHelper.maior(numeros);
                    System.out.println("O maior número é: " + maiorNumero);
                    break;

                case 4:
                    System.out.println("Quantos números queres introduzir?");
                    int m = scanner.nextInt();
                    int[] numerosSoma = new int[m];
                    System.out.println("Introduz os números:");

                    for (int i = 0; i < m; i++) {
                        numerosSoma[i] = scanner.nextInt();
                    }

                    int somaNumeros = MathHelper.soma(numerosSoma);
                    System.out.println("A soma dos números é: " + somaNumeros);
                    break;

                case 5:
                    System.out.println("Quantos números queres introduzir?");
                    int p = scanner.nextInt();
                    double[] numerosMedia = new double[p];
                    System.out.println("Introduz os números:");

                    for (int i = 0; i < p; i++) {
                        numerosMedia[i] = scanner.nextDouble();
                    }

                    double mediaNumeros = MathHelper.media(numerosMedia);
                    System.out.println("A média dos números é: " + mediaNumeros);
                    break;

                case 0:
                    sairmesmo = 1;
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (sairmesmo != 1);

        System.out.println("Programa terminado.");
    }
}