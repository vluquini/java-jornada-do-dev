package aula38emdiante;

import java.security.cert.Extension;

public class Account {
    private String conta;
    private String agencia;
    private String nome;
    private double valor;
    private final static int MAX_LENGHT = 12;

    public Account(String conta, String agencia, String nome) {
        this.conta = conta;
        this.agencia = agencia;
        setNome(nome);
    }

    public double getValor() {
        return valor;
    }

    public void depositar(double valor){
        this.valor += valor;
    }

    public void sacar(double valor){
        if(valor <= this.valor)
            this.valor -= valor;
        else
            System.out.println("Saldo insuficiente para saque.");
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNome(String nome) {
        if(nome.length() <= MAX_LENGHT)
            this.nome = nome;
        else
            this.nome = nome.substring(0, MAX_LENGHT);
    }

    public String getNome() {
        return nome;
    }
}
