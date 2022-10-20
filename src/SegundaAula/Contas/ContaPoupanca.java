package SegundaAula.Contas;

import SegundaAula.Cliente.*;

public class ContaPoupanca extends ContaBancaria {
    public Double taxarendimento;

    public ContaPoupanca(Integer numero, Integer Senha, Cliente nometitular)
    {
        super(numero,Senha,nometitular);

    }
    public void imprimirSaldo() {
        System.out.println(this.saldo);
    }

    public Double getTaxarendimento() {
        return this.taxarendimento;
    }

    public void setTaxarendimento(Double taxarendimento) {
        this.taxarendimento = taxarendimento;
    }


}
