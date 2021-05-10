package models;

public class Funcionario {
    private String nome;
    private double valorImposto;

    public double calculaImposto() {
        return this.valorImposto * 0.001;
    }
}
