package strategy;

public class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("💰 Pagando R$" + valor + " via Pix.");
    }

    @Override
    public String getMetodo() {
        return "Pix";
    }
}
