package maratona.java;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {

        String nome;
        String rua;
        String bairro;
        int numeroDaCasa;
        String telefone;
        String email;
        int idade;
        char sexo;

        System.out.println("Digite seu nome: ");
        nome = new Scanner(System.in).nextLine();


        System.out.println("Boa " + nome + ", agora digite o nome da sua rua: ");
        rua = new Scanner(System.in).nextLine();

        System.out.println("Valeu! :) Agora digite o número da sua casa");
        numeroDaCasa = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("Agora digite seu bairro:");
        bairro = new Scanner(System.in).nextLine();

        System.out.println("Você mora na R. " + rua + ", " + numeroDaCasa + " - " + bairro);

    }
}
