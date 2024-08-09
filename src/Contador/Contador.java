package Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int val1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        int val2 = ler.nextInt();

        try {
            contar(val1, val2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int param, int param2) throws ParametrosInvalidosException{
        if (param > param2) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 1; i <= param2 - param; i++)
                    System.out.println(i);
        }
    }
}
