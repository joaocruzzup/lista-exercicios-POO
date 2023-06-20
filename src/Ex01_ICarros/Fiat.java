package Ex01_ICarros;

public class Fiat extends Carro{
    public Fiat(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas, 3.0);
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando o motor...\nMinha velocidade está em: " + getVelocidade() + " km/h");
    }

    @Override
    public void freiar() {
        if (getVelocidade() == 0){
            System.out.println("Já estou parado!\nMinha velocidade está em: " + getVelocidade() + " km/h");
        } else {
            setVelocidade(getVelocidade() - 6);
            if (getVelocidade() < 0){
                setVelocidade(0.0);
            }
            System.out.println("Freando...\nMinha velocidade está em: " + getVelocidade() + " km/h");
        }
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 12);
        System.out.println("Acelerando...\nMinha velocidade está em: " + getVelocidade() + " km/h");
    }
}
