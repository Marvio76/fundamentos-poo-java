# Conceitos de POO: Composição, Associação, Agregação e Interface

Este repositório traz explicações simples e exemplos práticos para entender quatro conceitos importantes da Programação Orientada a Objetos (POO):

---

## 7. Composição

- **O que é?**  
  Um objeto **“tem” outro objeto** e é responsável por sua criação e destruição.  
- **Exemplo:**  
  Um `Carro` **tem um** `Motor`. Se o carro deixar de existir, o motor também deixa.

---

## 8. Associação

- **O que é?**  
  Um objeto **usa ou conhece** outro objeto, mas eles existem independentemente.  
- **Exemplo:**  
  Uma `Pessoa` **tem um** `Carro`. A pessoa pode existir sem o carro, e vice-versa.

---

## 9. Agregação

- **O que é?**  
  É um tipo especial de associação onde um objeto **agrupa outros objetos**, mas os objetos agrupados podem existir sem ele.  
- **Exemplo:**  
  Uma `Oficina` **tem vários** `Carros` para consertar, mas os carros existem mesmo sem a oficina.

---

## 10. Interface

- **O que é?**  
  Define um **contrato (métodos)** que uma classe deve implementar, garantindo que essa classe tenha determinadas funcionalidades.  
- **Exemplo:**  
  A interface `Oficina` define o método `consertar()`. Toda oficina que implementar essa interface deve fornecer a implementação desse método.

---

## Exemplo rápido

```java
interface Oficina {
    void consertar();
}

class Motor { /* Motor do carro */ }

class Carro {
    private Motor motor = new Motor(); // Composição
}

class Pessoa {
    private Carro carro; // Associação

    public Pessoa(Carro carro) {
        this.carro = carro;
    }
}

class OficinaMecanica implements Oficina { // Interface
    public void consertar() {
        System.out.println("Consertando carro");
    }
}
