package Ex01_ICarros;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainCarros {
    public static void main(String[] args) {

        // Teste Fiat
        System.out.println("*** Teste Fiat ***");
        Fiat fiat1 = new Fiat("Fiat", 2023, 90000.0, "verde", 4);
        testarCarro(5, 10, fiat1);

        // Teste Hyundai
        System.out.println("*** Teste Hyundai ***");
        Hyundai hyundai1 = new Hyundai("Hyundai", 2022, 100000.0, "preto", 2);
        hyundai1.iniciarPartida();
        testarCarro(20, 30, hyundai1);

        // Teste Renault
        System.out.println("*** Teste Renault ***");
        Renault renault1 = new Renault("Renault", 2023, 80000.0, "branco", 4);
        renault1.iniciarPartida();
        testarCarro(40, 50, renault1);
    }
    public static void testarCarro(int qtdAcelerar, int qtdFreiar, Carro carro){
        Scanner sc = new Scanner(System.in);
        if (carro instanceof Fiat){
            System.out.println("**** Teste de aceleração e freio do FIAT ****");
        } else if (carro instanceof Hyundai) {
            System.out.println("**** Teste de aceleração e freio do HYUNDAI ****");
        } else if (carro instanceof Renault) {
            System.out.println("**** Teste de aceleração e freio do RENAULT ****");
        }
        System.out.println("Digite *ENTER* para iniciar a acelerar");
        sc.nextLine();

        for (int i = 0; i < qtdAcelerar; i++) {
            carro.acelerar();
        }

        System.out.println("\n Digite *ENTER* para iniciar a freiar");
        sc.nextLine();

        for (int i = 0; i < qtdFreiar; i++) {
            carro.freiar();
        }
        System.out.println("\nDigite *ENTER* para Finalizar o teste deste carro");
        sc.nextLine();

    }
}