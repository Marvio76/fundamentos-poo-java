package Heranca;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gato meuGato = new Gato("Mingau", 3);

        // Usando métodos da classe Animal
        System.out.println(meuGato.apresentar());  // herdado
        System.out.println(meuGato.fazerSom());    // sobrescrito

        // Usando método da classe Gato
        System.out.println(meuGato.arranharMoveis());

        // Polimorfismo com lista
        Animal a1 = new Gato("Mingau", 3);
        Animal a2 = new Gato("Rex", 5); // Supondo que você tenha essa classe

        List<Animal> animais = new ArrayList<>();
        animais.add(a1);
        animais.add(a2);

        for (Animal a : animais) {
            System.out.println(a.nome + ": " + a.fazerSom());
        }
    }
}
