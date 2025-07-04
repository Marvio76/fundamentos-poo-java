package ClasseAbstrata;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Gato("Mingau");


        System.out.println(a1.apresentar() + " " + a1.fazerSom());
    }
}

