package models;

public class Atendente extends Funcionario{
    @Override
    public double calculaImposto() {
        return getSalario() * 0.001;
    }
}
