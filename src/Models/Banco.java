package Models;

import java.util.ArrayList;
import java.util.List;

public enum Banco {
    INSTANCE;
    
    private final List<Conta> contas = new ArrayList<>();
    
    public static Banco getBanco(){
        return INSTANCE;
    }
    public void addContas(Conta conta){
        contas.add(conta);
        conta.setIdAgencia(1);
    }
    
}