package trabpoo;

public class Motor {
    private String qtdPist;
    private String potencia;

    public String getQtdPist() {
        return qtdPist;
    }
    public void setQtdPist(String qtdPistAtual) {
        qtdPist = qtdPistAtual;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potenciaAtual) {
        potencia = potenciaAtual;
    }

    @Override
    public String toString() {
        return "Motor Pistão: " + qtdPist + ", potencia: " + potencia;

    }
}