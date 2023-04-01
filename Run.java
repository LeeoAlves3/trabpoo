package trabpoo;

public class Run {
    public static void main(String[] args) {

        Motor motor = new Motor();
        motor.setQtdPist("4");
        motor.setPotencia("2000");

        Veiculo v1 = new Veiculo();
        v1.defineMarcaModelo("Honda", "Civic");
        v1.quantidadeRodas = 4;
        v1.cor = "Prata";
        v1.setMotor(motor);

        Veiculo v2 = new Veiculo();
        v2.defineMarcaModelo("Tesla", "Model X");
        v2.quantidadeRodas = 4;
        v2.cor = "Vermelho";
        v2.setMotor(motor);

        Veiculo v3 = new Veiculo();
        v3.defineMarcaModelo("Honda", "Titan");
        v3.quantidadeRodas = 2;
        v3.cor = "Verde";
        v3.setMotor(motor);

        Veiculo v4 = new Veiculo();
        v4.defineMarcaModelo("Yamaha", "Fazer");
        v4.quantidadeRodas = 2;
        v4.cor = "Amarela";
        v4.setMotor(motor);

        Veiculo v5 = new Veiculo();
        v5.defineMarcaModelo("Caloi", "Bike");
        v5.quantidadeRodas = 2;
        v5.cor = "Preto";
        v5.setMotor(motor);

        System.out.println("           Marca |  Modelo | qtd rodas | cor | qtd pistao");
        System.out.println("************************************************************");

        System.out.println("Veiculo 1: " + v1.exibeMarca() + " |  " + v1.exibeModelo() + "  |     " + v1.quantidadeRodas  + "     | " + v1.cor + " | " + v1.getMotor());
        System.out.println("************************************************************");

        System.out.println("Veiculo 2: " + v2.exibeMarca() + " | " + v2.exibeModelo()  + " |     " + v2.quantidadeRodas  + "     | " + v2.cor  + " | " + v2.getMotor());
        System.out.println("************************************************************");

        System.out.println("Veiculo 3: " + v3.exibeMarca() + " |  " + v3.exibeModelo() + "  |     " + v3.quantidadeRodas  + "     | " + v3.cor  + " | " + v3.getMotor());
        System.out.println("************************************************************");

        System.out.println("Veiculo 4: " + v4.exibeMarca() + " |  " + v4.exibeModelo()  + " |     " + v4.quantidadeRodas  + "     | " + v4.cor  + " | " + v4.getMotor());
        System.out.println("************************************************************");

        System.out.println("Veiculo 5: " + v5.exibeMarca() + " |  " + v5.exibeModelo() + "  |     " + v5.quantidadeRodas  + "     |   " + v5.cor  + " | " + v5.getMotor());
        System.out.println("************************************************************");
    }
}
