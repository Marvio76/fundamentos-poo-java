package Heranca;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String fazerSom() {
        return "Algum som genérico";
    }

    public String apresentar() {
        return "Eu sou " + nome + ", tenho " + idade + " anos.";
    }
}
