package Ex01_ICarros;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainCarros {
    public static void main(String[] args) {

        // Teste fiat
        Fiat fiat1 = new Fiat("Fiat", 2023, 90000.0, "verde", 4);
        fiat1.iniciarPartida();
        fiat1.acelerar(); // velocidade = 15
        fiat1.freiar();   // velocidade = 9
        fiat1.freiar();   // velocidade = 3
        fiat1.freiar();   // velocidade = 0 (Normalmente seria -3, mas não existe velocidade negativa)
        fiat1.freiar();   // Não é possível freiar com velocidade 0

        // Teste Hyundai
        Hyundai hyundai = new Hyundai("Hyundai", 2022, 100000.0, "preto", 2);
        hyundai.iniciarPartida();
        hyundai.acelerar();
        for (int i = 0; i < 10; i++) {
            hyundai.freiar();
        }

        // Teste Renault
        Renault renault1 = new Renault("Renault", 2023, 80000.0, "branco", 4);
        hyundai.iniciarPartida();
        hyundai.acelerar();
        for (int i = 0; i < 10; i++) {
            hyundai.freiar();
        }
    }
}