package ClasseAbstrata;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String fazerSom() {
        return "Miau!";
    }
}
