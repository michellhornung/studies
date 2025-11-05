package com.alura;

import java.util.Scanner;

public class CalcularValorTroco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        String precoStr = scanner.next().replace(",", ".");
        double preco = Double.parseDouble(precoStr);

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o valor pago pelo cliente: ");
        String pagoStr = scanner.next().replace(",", ".");
        double valorPago = Double.parseDouble(pagoStr);

        double totalCompra = preco * quantidade;
        double troco = valorPago - totalCompra;

        System.out.println("\n========== RESUMO DA COMPRA ==========");
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
        System.out.printf("Valor pago: R$ %.2f%n", valorPago);

        if (troco < 0) {
            System.out.printf("❌ Falta pagar: R$ %.2f%n", Math.abs(troco));
        } else if (troco == 0) {
            System.out.println("✅ Pagamento exato, sem troco!");
        } else {
            System.out.printf("💰 Troco: R$ %.2f%n", troco);
        }

        scanner.close();
    }
}
