package br.com.productcontrol.util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner sc = new Scanner(System.in);

    // Ler inteiro
    public static int lerInt(String mensagem) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = Integer.parseInt(sc.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número inteiro válido.");
            }
        }
    }

    // Ler double
    public static double lerDouble(String mensagem) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            try {
                valor = Double.parseDouble(sc.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido (use ponto para decimal).");
            }
        }
    }

    // Ler String
    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }
}
