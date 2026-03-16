package app;

public class program {
    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        double x = 10.23453;

        String Product1 = "computer";
        String Product2 = "Office desk";
        int idade1 = 30;
        int code = 5290;
        char gender = 'F';
        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;
        
        System.out.println("Products:");

        System.out.printf("%s, which price is $%.2f %s, which price is $%.2f", Product1, prince1, Product2, prince2);
        System.out.println("");
        System.out.printf("Record: %d years Old, code %d and gender: %s", idade1, code, gender);
        System.out.println("");
        System.out.printf("Measue with eight decimal places:%f Rouded (three decimal places):%.3f US decimal points %.3f", measure, measure, measure);
        System.out.println("");
        System.out.printf("%s tem %d anos e ganha R$%.1f reais %n", nome, idade, renda);

        System.out.println(x);
        System.out.printf("%.1f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado=" + x + " metros");
        System.out.printf("Resultado =%.2f metros %n", x);
        System.out.println("OLá mundo");
        System.out.println("Bom dia");

    }
}
