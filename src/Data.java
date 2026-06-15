import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private static Scanner sc = new Scanner(System.in);

    public Data() {
        System.out.println("Digite o dia: ");
        int d = sc.nextInt();
        System.out.println("Digite o mês: ");
        int m = sc.nextInt();
        System.out.println("Digite o ano: ");
        int a = sc.nextInt();
        
        if (dataValida(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            System.out.println("Data inválida. Tente novamente.");
            new Data();
        }
    }

    public Data(int d, int m, int a) {
        if (dataValida(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            System.out.println("Data inválida. Criando data padrão 01/01/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean dataValida(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1) return false;
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m == 2 && bissexto(a)) diasMes[1] = 29;
        return d <= diasMes[m - 1];
    }

    public void entraDia(int d) {
        if (dataValida(d, this.mes, this.ano))
            this.dia = d;
        else
            System.out.println("Dia inválido para o mês/ano atual.");
    }

    public void entraMes(int m) {
        if (dataValida(this.dia, m, this.ano))
            this.mes = m;
        else
            System.out.println("Mês inválido para o dia/ano atual.");
    }

    public void entraAno(int a) {
        if (dataValida(this.dia, this.mes, a))
            this.ano = a;
        else
            System.out.println("Ano inválido para a data atual.");
    }

    public void entraDia() {
        System.out.print("Digite o dia: ");
        int d = sc.nextInt();
        entraDia(d);
    }

    public void entraMes() {
        System.out.print("Digite o mês: ");
        int m = sc.nextInt();
        entraMes(m);
    }

    public void entraAno() {
        System.out.print("Digite o ano: ");
        int a = sc.nextInt();
        entraAno(a);
    }

    public int retDia() {
        return this.dia;
    }

    public int retMes() {
        return this.mes;
    }

    public int retAno() {
        return this.ano;
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public String mostra2() {
        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        return dia + "/" + meses[mes - 1] + "/" + ano;
    }

    public boolean bissexto() {
        return bissexto(this.ano);
    }

    private boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasTranscorridos() {
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (bissexto()) diasMes[1] = 29;
        int total = 0;
        for (int i = 0; i < this.mes - 1; i++) {
            total += diasMes[i];
        }
        total += this.dia;
        return total;
    }

    public void apresentaDataAtual() {
        Date hoje = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + df.format(hoje));
    }

    public static void fecharScanner() {
        sc.close();
    }
}