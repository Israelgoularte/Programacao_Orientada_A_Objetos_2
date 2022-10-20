package SegundaAula;
import SegundaAula.Cliente.*;
import SegundaAula.Contas.*;

public class Main{

    
    public static void main(String[] args) {
        Cliente C1 = new ClientePF("Nome1", "Sobrenome1", "Rua bairro cidade estado pais", "1234556788644");
        //ContaBancaria CB = new ContaBancaria(01, 01, C1);
        ContaCorrente CC = new ContaCorrente(2, 2, C1);
        ContaPoupanca CP = new ContaPoupanca(3, 3, C1);
        
        CC.depositar(1000.00);
        CP.depositar(500.00);
        
        CC.depositar(390.00);
        System.out.println("CC");
        ContaBancaria.imprimirSaldo(CC);
        
        CP.depositar(900.00);
        
        System.out.println("CP");
        
        CP.imprimirSaldo();
        
        CC.sacar(40.00, 2);
        
        System.out.println("CC");
        ContaBancaria.imprimirSaldo(CC);
        
        CP.sacar(50.00, 3);
        CP.imprimirSaldo();

    }
}