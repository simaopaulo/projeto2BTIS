package MathHelper;

public class MathHelper {

    public static int numeroSeguinte(int numero) {
        return numero + 1;
    }

    public static String juntarNome(String nome, String apelido) {
        return nome + " " + apelido;
    }

    public static int maior(int[] numeros) {
        int maior = numeros[0];
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int soma(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public static double media(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }
}