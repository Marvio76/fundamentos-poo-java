package Conteudo_Prova;

class Carro {
private Motor motor; // Composição: Carro tem Motor

public Carro() {
    motor = new Motor(); // Motor é criado junto com Carro
}

public void ligarCarro() {
    motor.ligar();
}
}