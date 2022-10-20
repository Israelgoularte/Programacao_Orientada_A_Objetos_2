package SegundaAula.Cliente;

public class ClientePF extends Cliente {
    private String CPF;


    public ClientePF(String nome, String Sobrenome, String Endereco,String CPF) {
        super(nome, Sobrenome, Endereco);
        this.CPF = CPF;
    }


    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


}
