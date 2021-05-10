package models;

public class Gerente extends Funcionario{

    @Override
    public double calculaImposto() {
        return getSalario() * 0.01;
    }
}
