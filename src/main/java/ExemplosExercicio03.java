import models.*;

public class ExemplosExercicio03 {
    public static void main(String[] args) {
        Gerente gerenteJose = new Gerente();
        gerenteJose.setNome("Jose");
        gerenteJose.setSalario(1000.0);
        System.out.println(gerenteJose.toString());
        System.out.println("Imposto: " + gerenteJose.calculaImposto() + "\n");

        Supervisor supervisorJoao = new Supervisor();
        supervisorJoao.setNome("Joao");
        supervisorJoao.setSalario(1000.0);
        System.out.println(supervisorJoao.toString());
        System.out.println("Imposto: " + supervisorJoao.calculaImposto() + "\n");

        Atendente atendenteMaria = new Atendente();
        atendenteMaria.setNome("Maria");
        atendenteMaria.setSalario(1000.0);
        System.out.println(atendenteMaria.toString());
        System.out.println("Imposto: " + atendenteMaria.calculaImposto() + "\n");
    }
}
