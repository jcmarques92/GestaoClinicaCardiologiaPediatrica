package util;

import java.util.Scanner;

/**
 * Created by andrecosta on 12/11/16.
 */
public class Consola {

    public static Scanner sc = new Scanner(System.in);

    public static int lerInt(String texto, int min, int max) {
        int num = -1;
        do {
            System.out.print(texto);
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num < min || num > max) {
                    System.out.println("Número inválido. Número deve estar compreendido entre " + min + " e " + max + ".");
                }
            } else {
                System.out.println("Tem de introduzir um número inteiro!");
            }
            sc.nextLine();
        } while (num < min || num > max);
        return num;
    }
}
