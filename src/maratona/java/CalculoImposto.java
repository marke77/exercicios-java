package maratona.java;

import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {

        double salario;

        System.out.println("Digite seu salário: R$ ");
        salario = new Scanner(System.in).nextDouble();

        double taxa01 = (salario * 0.097);
        double taxa02 = (salario * 0.3735);
        double taxa03 = (salario * 0.4950);

    if (salario <= 34712) {
        System.out.println("Voce paga: R$ " + taxa01 + " de taxa" + "\nNo total, sobrará: R$ " + (salario - taxa01));
    }else if (salario > 34712 && salario <= 68507) {
        System.out.println("Voce paga: R$ " + taxa02 + " de taxa" + "\nNo total, sobrará: R$ " + (salario - taxa02));
    }else{
        System.out.println("Voce paga: R$ " + taxa03 + " de taxa" + "\nNo total, sobrará: R$ " + (salario - taxa03));

    }

    }
}
