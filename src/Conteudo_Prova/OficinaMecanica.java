package Conteudo_Prova;

// 9. Agregação: Oficina conserta carros, mas carros existem independente da oficina
class OficinaMecanica implements Oficina {
    // Oficina implementa interface Oficina

    public void consertar() {
        System.out.println("Consertando carro");
    }
}
