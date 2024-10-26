package maratona.java;

import java.util.Scanner;

public class ControleAcesso  {
    public static void main(String[] args) {

    int idade;

    System.out.println("Digite sua idade: ");
    idade = new Scanner(System.in).nextInt();

    if (idade >= 18) {
        System.out.println("Seja bem-vindo(a) à Adega!");
    } else {
        System.out.println("Acesso negado para menores de 18 anos!");
    }

    }
}
