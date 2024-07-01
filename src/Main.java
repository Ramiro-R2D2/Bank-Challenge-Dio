import Models.Banco;
import Models.Cliente;
import Models.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Banco b1 = Banco.getBanco();

        Cliente Jubileu = new Cliente("Jubileu", 1111111);
        Cliente Anna = new Cliente("Anna", 14511);
        Cliente Vanda = new Cliente("Vanda", 333331);
        Cliente Zeca = new Cliente("Zeca", 2222222);

        ContaCorrente c1 = new ContaCorrente(Anna);
        ContaCorrente c2 = new ContaCorrente(Jubileu);
        ContaCorrente c3 = new ContaCorrente(Vanda);
        ContaCorrente c4 = new ContaCorrente(Zeca);

        b1.addContas(c1);
        b1.addContas(c2);
        b1.addContas(c3);
        b1.addContas(c4);
        
        c2.DepositarDinehiro(1500);
        c1.DepositarDinehiro(1400);
        c3.DepositarDinehiro(1000);
        c4.DepositarDinehiro(2000);

        c2.extrato();
        c1.extrato();
        c3.extrato();
        c4.extrato();

        c2.TransferirDinheiro(0, 100);
        c2.extrato();
        c1.extrato();
    }
}