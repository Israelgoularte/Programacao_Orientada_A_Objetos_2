package SegundaAula.Cliente;

public class Cliente {
    private String nome;
    private String Sobrenome;
    private String Endereco;


    public Cliente(String nome, String Sobrenome, String Endereco) {
        this.nome = nome;
        this.Sobrenome = Sobrenome;
        this.Endereco = Endereco;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    
}
