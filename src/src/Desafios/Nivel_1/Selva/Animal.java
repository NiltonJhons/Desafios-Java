package Desafios.Nivel_1.Selva;

public abstract class Animal {
    abstract String emitirSom();
    abstract String seAlimentar();

    public String aoAnoitecer() {
        return "Se esconder e dormir.";
    }
}
