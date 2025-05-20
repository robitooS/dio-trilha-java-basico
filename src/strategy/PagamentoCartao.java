package strategy;

public class PagamentoCartao implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("💳 Pagando R$" + valor + " no cartão.");
    }

    @Override
    public String getMetodo() {
        return "Cartão";
    }
}
