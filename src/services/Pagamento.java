package services;

public class Pagamento {
    public void registrarTransacao(String metodo, double valor) {
        System.out.println("📒 Registrando pagamento de R$" + valor + " via " + metodo);
    }
}
