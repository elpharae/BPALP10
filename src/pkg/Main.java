package pkg;

import java.util.Scanner;

public class Main {

    private static final int LIMIT = 50;
    private static final int MIN = 25;
    private static final int MAX = 75;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej cislo:");
        int cislo = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadej text:");
        String text = sc.nextLine();

        Validatorovna v = new Validatorovna(10);
        v.pridejValidator(new CisloMensiNezValidator(cislo, Main.LIMIT));
        v.pridejValidator(new CisloVIntervaluValidator(cislo, Main.MIN, Main.MAX));
        v.pridejValidator(new RetezecObsahujeCisloValidator(text));

        v.zvalidujVse();
    }
}
