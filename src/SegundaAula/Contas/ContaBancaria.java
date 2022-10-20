package SegundaAula.Contas;

import SegundaAula.Cliente.Cliente;

public class ContaBancaria {
    public Integer numero;
    private Integer Senha;
    protected Double saldo;
    public Cliente Cliente;

    public ContaBancaria(Integer numero, Integer Senha, Cliente Cliente)
    {
        this.numero=numero;
        this.Senha = Senha;
        this.Cliente = Cliente;
        this.saldo=0.0;
    }

    public boolean sacar(Double valor, Integer Senha)
    {
        if(isSenha(Senha) && this.saldo>=valor)
        {
            this.saldo-=valor;
            return true;
        }
        else return false;
    }

    public void depositar(Double valor)
    {
        this.saldo+=valor;
    }

    public static void imprimirSaldo(ContaBancaria Conta)
    {
        System.out.println("Saldo: "+ Conta.getSaldo());
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getSenha() {
        return this.Senha;
    }

    public void setSenha(Integer Senha) {
        this.Senha = Senha;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return this.Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public boolean isSenha(Integer Senha)
    {
        return this.Senha==Senha;
    }
}
