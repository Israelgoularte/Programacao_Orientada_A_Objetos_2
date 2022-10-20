package SegundaAula.Contas;
import SegundaAula.Cliente.*;
public class ContaCorrente extends ContaBancaria implements Tributavel{
    public Double limiteespecial;

    public ContaCorrente(Integer numero, Integer Senha, Cliente nometitular)
    {
        super(numero,Senha,nometitular);
        this.limiteespecial = 0.0;
    }

    @Override
    public boolean sacar(Double valor, Integer Senha)
    {
        if(isSenha(Senha)&& this.saldo+this.limiteespecial>=valor)
        {
            this.saldo-=valor;
            return true;
        }
        else return false;
    }

    public Double getLimiteespecial() {
        return this.limiteespecial;
    }

    public void setLimiteespecial(Double limiteespecial) {
        this.limiteespecial = limiteespecial;
    }
    
    @Override
    public double getValorImposto() {

        return saldo/100;
    }
}
