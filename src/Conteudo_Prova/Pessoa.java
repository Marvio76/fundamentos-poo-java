package Conteudo_Prova;

// 8. Associação: Pessoa tem um Carro, mas não é dono exclusivo (pode existir sem Pessoa)
class Pessoa {
    private Carro carro; // Associação: Pessoa "tem" um Carro

    public Pessoa(Carro carro) {
        this.carro = carro;
    }

    public void dirigir() {
        System.out.println("Pessoa dirigindo");
        carro.ligarCarro();
    }
}
