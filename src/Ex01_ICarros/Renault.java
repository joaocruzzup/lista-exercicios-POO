package Ex01_ICarros;

public class Renault extends Carro{

    public Renault(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas, 0.0);
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando o motor...\nMinha velocidade está em: " + getVelocidade() + " km/h");
    }

    @Override
    public void freiar() {
        if (getVelocidade() == 0){
            System.out.println("Já estou parado!\n Minha velocidade está em: " + getVelocidade() + " km/h");
        } else {
            setVelocidade(getVelocidade() - 5);
            System.out.println("Freando...\nMinha velocidade está em: " + getVelocidade() + " km/h");
        }
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println("Acelerando...\nMinha velocidade está em: " + getVelocidade() + " km/h");
    }
}
