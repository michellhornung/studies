package JavaEspec.src.com.alura.others.folhadepagamento;

public class FolhaPagamento {
    double calcularSalario(int horasNormais, int horasExtras,
                           double valorHoraNormal, double valorHoraExtra) {
        double valorHorasNormais = horasNormais * valorHoraNormal;
        double valorHorasExtras = horasExtras * valorHoraExtra;

        return valorHorasNormais + valorHorasExtras;
    }

    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        int horasNormais = 160;
        int horasExtras = 10;
        double valorHoraNormal = 50.0;
        double valorHoraExtra = 75.0;

        double salarioTotal = folha.calcularSalario(horasNormais, horasExtras,
                valorHoraNormal, valorHoraExtra);

        System.out.println("=== FOLHA DE PAGAMENTO ===");
        System.out.println("Horas Normais: " + horasNormais + "h x R$ " + valorHoraNormal);
        System.out.println("Horas Extras: " + horasExtras + "h x R$ " + valorHoraExtra);
        System.out.println("Salário Total: R$ " + String.format("%.2f", salarioTotal));
    }
}