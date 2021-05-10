package models;

public class Funcionario {
    private String nome;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calculaImposto() {
        return this.salario * 0.001;
    }

    @Override
    public String toString() {
        return "Funcionario:\n" +
                "Nome: " + nome + '\n' +
                "Salario: " + salario;
    }
}
