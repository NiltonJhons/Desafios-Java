package Desafios.Nivel_1.p011_SelvaPOO;

public class Main {
    // Proposta: Criar uma classe abstrata ("Animal") com métodos comuns e abstratos. Criar subclasses como "Leão" e "Macaco"
    // que herdem comportamentos e tenha as suas próprias ações diante disso. Usar herança e polimorfismo.

    static void main() {

        // Animal animal = new Animal(); Não é possível instanciar uma classe folha.
        Animal leao = new Leao(); // Desse modo, métodos apenas pertencentes de Leao não estarão disponíveis
        Macaco macaco = new Macaco(); // Desse modo, mesmo os mesmos que só existem em Macaco também estarão disponíveis

        System.out.println(leao.emitirSom()); // roar, grrr
        System.out.println(leao.seAlimentar()); // Caçar outros animais e comer.
        System.out.println(leao.aoAnoitecer()); // Se esconder e dormir.
        System.out.println(macaco.emitirSom()); // u á á
        System.out.println(macaco.seAlimentar()); // Comer frutas.
        System.out.println(macaco.aoAnoitecer()); // Se esconder e dormir.
    }
}
