package Models;

public abstract class Conta {
    double saldo = 0;
    protected static int idConta = 0;
    protected Cliente cliente;
    protected int idAgencia;

    protected void setIdAgencia(int id){
        idAgencia = id;
    }
    public Conta(Cliente cliente){
        this.cliente = cliente;
        idConta++;
    } 
    public void DepositarDinehiro(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
    public String SaquarDinehiro(double valor){
       if (valor > saldo){
           return "Saldo insuficiente";
       }
       saldo -= valor;
       return saldo + "reais reitrados com sucesso!";
    }
    public void TransferirDinheiro(int idDaConta, double valor){
        if(saldo >= valor){
            System.out.println( "Sucesso!! \n" + "Foram transferidos " + valor + " reais para a conta de ID: " + idDaConta);
        }else{
            System.out.println("Saldo insuficiente!!!");
        }
    }
    public String extrato(){
        return "Cliente: " + cliente.getNome() + "\n Saldo total: " + saldo + "reais.";
    }
}
