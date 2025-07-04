package ClasseAbstrata;

public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract String fazerSom(); // método abstrato (sem corpo)

    public String apresentar() {
        return "Eu sou " + nome;
    }
}

