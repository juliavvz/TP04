public class testeData {
    public static void main(String[] args) {

        // Testando construtor com parâmetros
        Data data1 = new Data(15, 6, 2026);

        System.out.println("=== Data 1 ===");
        System.out.println("Mostra1: " + data1.mostra1());
        System.out.println("Mostra2: " + data1.mostra2());
        System.out.println("Dia: " + data1.retDia());
        System.out.println("Mês: " + data1.retMes());
        System.out.println("Ano: " + data1.retAno());
        System.out.println("bissexto: " + data1.bissexto());
        System.out.println("Dias transcorridos: " + data1.diasTranscorridos());

        System.out.println();

        // Testando construtor sem parâmetros4

        System.out.println("=== Data 2 ===");
        Data data2 = new Data();

        System.out.println();

        System.out.println("Mostra1: " + data2.mostra1());
        System.out.println("Mostra2: " + data2.mostra2());
        System.out.println("É bissexto? " + data2.bissexto());
        System.out.println("Dias transcorridos: " + data2.diasTranscorridos());

        System.out.println();

        // Testando métodos de entrada
        System.out.println("=== Alterando Data 2 ===");
        data2.entraDia();
        data2.entraMes();
        data2.entraAno();

        System.out.println("Nova data: " + data2.mostra1());

        System.out.println();

        // Testando métodos com parâmetros
        data2.entraDia(25);
        data2.entraMes(12);
        data2.entraAno(2028);

        System.out.println("Data após alteração por parâmetros: "
                           + data2.mostra1());

        System.out.println();

        // Testando data atual
        System.out.println("=== Data Atual ===");
        data2.apresentaDataAtual();

        Data.fecharScanner();
    }
}