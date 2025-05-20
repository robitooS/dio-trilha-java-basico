package facade;

import services.Estoque;
import services.NotaFiscal;
import services.Pagamento;
import strategy.PagamentoStrategy;

public class LojaFacade {
    private Estoque estoque = new Estoque();
    private Pagamento pagamento = new Pagamento();
    private NotaFiscal notaFiscal = new NotaFiscal();
    private PagamentoStrategy pagamentoStrategy;

    public LojaFacade(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void comprar(String produto, double valor) {
        System.out.println("🛒 Iniciando processo de compra...\n");
        estoque.verificar(produto);
        pagamentoStrategy.pagar(valor);
        pagamento.registrarTransacao(pagamentoStrategy.getMetodo(), valor);
        notaFiscal.gerar(produto);
        System.out.println("\n✅ Compra finalizada!\n");
    }
}
