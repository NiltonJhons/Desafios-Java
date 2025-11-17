package Desafios.Nivel_1.p018.DataSimples;

public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formatacao() {
        String mesNome = "";

        switch (this.mes) {
            case 1 -> mesNome = "Janeiro";
            case 2 -> mesNome = "Fevereiro";
            case 3 -> mesNome = "Março";
            case 4 -> mesNome = "Abril";
            case 5 -> mesNome = "Maio";
            case 6 -> mesNome = "Junho";
            case 7 -> mesNome = "Julho";
            case 8 -> mesNome = "Agosto";
            case 9 -> mesNome = "Setembro";
            case 10 -> mesNome = "Outubro";
            case 11 -> mesNome = "Novembro";
            case 12 -> mesNome = "Dezembro";
        }

        return String.format("%d/%s/%d", this.dia, mesNome, this.ano);
    }
}
