package strategy;

public interface PagamentoStrategy {
    void pagar(double valor);
    String getMetodo(); // para identificar o tipo no log
}