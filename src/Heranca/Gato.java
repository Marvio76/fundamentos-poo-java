package Heranca;
                    // Herança
public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade); // Chama o construtor da classe pai
    }
    //  Sobrescrita de método (Override)
    @Override
    public String fazerSom() {
        return "Miau!";
    }

    public String arranharMoveis() {
        return nome + " está arranhando os móveis!";
    }
}
