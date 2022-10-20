package SegundaAula.Cliente;

public class ClientePJ extends Cliente{
    private String CNPJ;


    public ClientePJ(String nome, String Sobrenome, String Endereco,String CNPJ) {
        super(nome, Sobrenome, Endereco);
        this.CNPJ = CNPJ;
    }


    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }


}
