package Models;

public class Cliente {
    public String nome;
    protected int cpf;

    public Cliente(String nome, int cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
