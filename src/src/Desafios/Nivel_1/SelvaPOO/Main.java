package Desafios.Nivel_1.SelvaPOO;

public class Main {
    // Proposta: Crie classes para representar animais.
    // Use herança para especializar comportamentos (ex: Leão ruge, Macaco pula).

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
