package strategy;

public class PagamentoBoleto implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("📄 Pagando R$" + valor + " no boleto.");
    }

    @Override
    public String getMetodo() {
        return "Boleto";
    }
}
