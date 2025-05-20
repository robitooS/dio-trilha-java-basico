import facade.LojaFacade;
import strategy.PagamentoBoleto;
import strategy.PagamentoCartao;
import strategy.PagamentoPix;

public class Main {
    public static void main(String[] args) {
        LojaFacade lojaPix = new LojaFacade(new PagamentoPix());
        lojaPix.comprar("Mouse gamer", 120.50);

        LojaFacade lojaCartao = new LojaFacade(new PagamentoCartao());
        lojaCartao.comprar("Teclado mecânico", 350.00);

        LojaFacade lojaBoleto = new LojaFacade(new PagamentoBoleto());
        lojaBoleto.comprar("Monitor 24\"", 899.99);
    }
}
