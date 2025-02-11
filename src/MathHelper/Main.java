package MathHelper;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////

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


////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        int escolha;
        int numero;
        String nome;
        String apelido;
        String juntarnomes;
        //sair
        int sair;
        int sairmesmo = 0;

        Scanner scanner = new Scanner(System.in);

        do {
        menu(); // Menu começa
        escolha = scanner.nextInt();
        scanner.nextLine(); // comer /n

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

                break;

            case 4:

                break;

            case 5:

                break;

            case 0:

                break;

            default:
                System.out.println("Opção invalida, tente novamente.");
                break;
                }
        } while (sairmesmo != 1);
    }
}