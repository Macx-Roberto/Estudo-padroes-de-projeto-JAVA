package adapter;

/**
 *
 * @author macxi
 */
public class Main {

    private static void mostrarSaldo(Conta conta) {
        conta.mostrarSaldo();
    }
    
    private static void executarDocumento(Documento documento) {
        documento.
            abrirDocumento().venderItem().fazerPagamento().fecharDocumento();
    }
    
    public static void main(String[] args) {
       /* Conta cc = new ContaCorrente();
        Conta cs = new ContaSalario();
        Conta cp = new PoupancaAdapter(new ContaPoupanca);
        
        mostrarSaldo(cc);
        mostrarSaldo(cs);
        mostrarSaldo(cp);*/
       
        executarDocumento(new Venda());
        executarDocumento(new AdapterOs(new OrdemServico()));

    }
    
}
