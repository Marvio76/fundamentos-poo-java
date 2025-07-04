package Conteudo_Prova;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();          // Criando carro com motor (composição)
        Pessoa pessoa = new Pessoa(carro);  // Pessoa tem carro (associação)
        Oficina oficina = new OficinaMecanica(); // Oficina pode consertar (interface + agregação)

        pessoa.dirigir();
        oficina.consertar();
    }
}
