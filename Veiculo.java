package trabpoo;

public class Veiculo {
    private String marca;
    private String modelo;
    public int quantidadeRodas;
    public String cor;
    private Motor motor;

    public void defineMarcaModelo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String exibeMarca () {
        return marca;
    }

    public String exibeModelo () {
        return modelo;
    }

    public Motor getMotor () {
        return motor;
    }

    public void setMotor (Motor motorAtual) {
        motor = motorAtual;
    }
}
    